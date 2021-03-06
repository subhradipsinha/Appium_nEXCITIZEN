package com.TestCase.MutationTestCase_Folder;

import com.PageObject.Mutation_Certificate_Folder.Mutation_Certificate;
import org.testng.annotations.Test;


public class Mutation_TestCase {

    Mutation_Certificate mutation_certificate = new Mutation_Certificate();

    @Test(priority = 37)
    public void Hit_Mutation_Certificate()throws Exception{
        //Hit_Mutation_Certificate
        mutation_certificate.Hit_Mutation_Certificate_Tab();
        System.out.println("Hit_Mutation_Certificate");
    }

    @Test(priority = 38)
    public void Hit_Address_Seletion() throws Exception {
        mutation_certificate.Address_Seletion_Link();
        System.out.println("Hit_Address_Seletion");
    }

    @Test(priority = 39)
    public void Hit_Mutation_Details()
    {
        mutation_certificate.Mutation_Details_Link();
        System.out.println("Hit_Mutation_Details");
    }
    @Test(priority = 40)
    public void Hit_House_Details(){
        mutation_certificate.House_Details_Link();
        System.out.println("Hit_House_Details");
    }
    @Test(priority = 41)
    public void Hit_Application_Details(){
        mutation_certificate.Application_Details_Link();
        System.out.println("Hit_Application_Details");
    }
    @Test(priority = 42)
    public void Hit_Owner_Details() throws Exception {
        mutation_certificate.Owner_Details_Link();
        System.out.println("Hit_Owner_Details");
    }
}