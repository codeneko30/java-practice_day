// example-1

class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class student_info {
    public static void main(String[] args) {
        try {
            int studentId = 101;

            throw new StudentNotFoundException("Student ID " + studentId + " not found!");
        }

        catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// example-2

class CardNotFoundException extends RuntimeException {
    public CardNotFoundException(String message) {
        super(message);
    }
}

class card_idInfo {
    public static void main(String[] args) {
        int dbCardId = 101;
        int cardId = 105;

        try {

            if (cardId != dbCardId) {
                throw new CardNotFoundException("Card ID " + cardId + " not found!");
            }

            System.out.println("Card ID " + cardId + " found!");
        } catch (CardNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// example-3

class BalanceError extends RuntimeException {

    public BalanceError(String message) {
        super(message);
    }
}

class bank {

    public static void main(String[] args) {

        int balance = 1000;
        int amount = 1500;

        try {

            if (amount > balance) {
                throw new BalanceError("Not enough balance");
            }

            System.out.println("Money withdrawn successfully");

        } catch (BalanceError error) {

            System.out.println("Error: " + error.getMessage());
        }
    }
}
