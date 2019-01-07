package com.capgemini.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.app.bean.Organization;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
       Organization organization= (Organization) context.getBean(com.capgemini.app.bean.Organization.class,"organization");
       System.out.println(organization.getName());
       System.out.println(organization.getOrgId());
       System.out.println(organization.getDateOfEstablishment());
       System.out.println(organization.getShareValue());
       System.out.println(organization.getBoardMembers());
       System.out.println(organization.getBranchManagers());
       System.out.println(organization.getCities());
       System.out.println(organization.getIpAddresses());
       System.out.println(organization.isListed());
    }
}
