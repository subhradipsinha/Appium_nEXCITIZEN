package com.TestCase.Birth_Cirtificate_Test_Case_Folder;

import com.PageObject.Birth_Cirtificate_Folder.Birth_Cirtificate;
import org.testng.annotations.Test;

public class Birth_Cirtificate_Test_Case {
    Birth_Cirtificate birth_cirtificate = new Birth_Cirtificate();

    @Test(priority = 5)
    public void BithCirtificate_Tabhit() throws Exception {
        birth_cirtificate.Birth_Cirtificate_Text();
    }
}
