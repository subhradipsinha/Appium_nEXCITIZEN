package com.TestCase.Property_Test_Case_Folder;

import com.PageObject.Property_Tax.Folder.Property_Tax;
import org.testng.annotations.Test;

public class Property_Test_Case {
    Property_Tax property_tax = new Property_Tax();
    @Test(priority = 16)
    public void Property_TabHit() throws Exception {
        property_tax.property_Tax_Test();
    }
}
