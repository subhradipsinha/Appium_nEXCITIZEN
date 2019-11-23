package com.TestCase.Death_Test_Case_Folder;

import com.PageObject.Death_Certificate_Folder.Death_Certificate;
import org.testng.annotations.Test;

public class Death_Test_Case {
    Death_Certificate death_certificate = new Death_Certificate();
    @Test(priority = 8)
    public void Death_TabHit() throws Exception {
        death_certificate.Registrasion();
    }
}
