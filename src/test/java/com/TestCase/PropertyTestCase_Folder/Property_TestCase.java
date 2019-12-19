package com.TestCase.PropertyTestCase_Folder;

import com.PageObject.Property_Tax_Folder.Property_Tax;
import org.testng.annotations.Test;

public class Property_TestCase {
    Property_Tax property_tax = new Property_Tax();
    @Test(priority = 21)
    public void Property_TabHit() throws Exception {
        property_tax.property_Tax_Test();
    }
}
