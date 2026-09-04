class AtmWithdrawal {

    public static void main(String[] args) {
        int accountBalance = 5000;
        int withdrawalAmount = 8000;

        if (accountBalance >= withdrawalAmount) {
            System.out.println("Transaction successful." );
            
        } 

        else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }

    }
}

