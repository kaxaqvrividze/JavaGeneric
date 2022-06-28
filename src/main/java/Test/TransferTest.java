package Test;

import Steps.TransfersPageSteps;


public class TransferTest {

    TransfersPageSteps transfersPageSteps = new TransfersPageSteps();

    public void ClientIdentify(){
        transfersPageSteps.CheckClient();
    }

    public void SendTransfer(){
        transfersPageSteps.TransferCheckCurrency();
    }
}
