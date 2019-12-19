package com.TestCase.DeathTestCase_Folder;

import com.PageObject.Death_Certificate_Folder.Death_Certificate;
import org.testng.annotations.Test;

public class Death_TestCase {
    Death_Certificate death_certificate = new Death_Certificate();
    @Test(priority = 18)
    public void Death_TabHit() throws Exception {
        death_certificate.Registrasion();
    }
}
