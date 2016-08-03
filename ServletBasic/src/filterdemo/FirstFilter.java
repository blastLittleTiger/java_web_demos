package filterdemo;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:IP���ˣ�IP��������
// Name:${NAME}
// Date:2016/6/24.
// Copyright="(c) renjiaxin.jesse 2016'
// Licence = "prayjourney 2016"
//
//                �� ��       �� ��
//              ���� �ߩ��������� �ߩ�
//              ��    #
//              ��   �ש�  ��*��   ��    ���ɴ���ĥ�������ǹ�������ĭ��
//              ��      ��  ��
//              ������       ��������
//                 ��         ����������������
//                 ��  ���ޱ���             �ǩ���
//                 ��  ����BUG��         ����
//                 �������� �����������ש�������
//                  �����ϩ���    �����ϩ� ��
//                  �����ߩ���    ������ ����
//
// ---------------------------------------------------------------

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "FirstFilter")
public class FirstFilter implements javax.servlet.Filter
{
    protected FilterConfig fc;
    protected String ip;

    public void init(FilterConfig config) throws ServletException
    {
        this.fc = config;//��������
        this.ip = config.getInitParameter("ip");//ȡ�ò���,���Ҫ�ڳ�ʼ������ʱ���ж�Ӧ����
        System.out.println("init firstfilter!");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException
    {
        System.out.println("execute firstfilter!");
        String localip = req.getLocalAddr();//��ȡIP
        if (localip.equals(ip))//�ж�IP�Ƿ񱻽�ֹ
        {
            resp.setContentType("text/html;charset=UTF-8");//����ContenType
            resp.setCharacterEncoding("UTF-8");//�����������
            PrintWriter pw = resp.getWriter();
            pw.write("<h1>��IP��ֹ����,����ϵ����Ա!</h1>");
        } else
        {
            chain.doFilter(req, resp);//���´���

        }
    }


    public void destroy()
    {
        System.out.println("destory firstfilter!");
    }

}
