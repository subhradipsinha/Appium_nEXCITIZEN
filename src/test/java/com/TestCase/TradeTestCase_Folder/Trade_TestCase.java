package com.TestCase.TradeTestCase_Folder;

import com.PageObject.Trade_Licence_Folder.Trade_Licence;
import org.testng.annotations.Test;

public class Trade_TestCase {
    Trade_Licence trade_licence = new Trade_Licence();
    @Test(priority = 11)
    public void Tread_Licence_TabHit() throws Exception {
        trade_licence.Trade_Licence_Test();
    }
}
