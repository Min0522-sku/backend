package day07;

public class Practice10 {
    public static void main(String[] args) {
        Member member = new Member();
        member.setId("admin");
        System.out.println(member.getId());

        Score score = new Score();
        score.setScore(85);
        score.setScore(120);

        BankAccount bankAccount = new BankAccount("123-456");
        System.out.println(bankAccount.getAccountNumber());

        CircleCalculator cc = new CircleCalculator();
        System.out.println(cc.printCircleArea(5));

        TicketMachine machine1 = new TicketMachine();
        TicketMachine machine2 = new TicketMachine();
        TicketMachine machine3 = new TicketMachine();
        machine1.issueTicket();
        machine1.issueTicket();
        machine2.issueTicket();
        TicketMachine.printTotalTickets();


        System.out.println(GameConfig.GAME_TITLE);
        System.out.println(GameConfig.MAX_LEVEL);
        System.out.println(GameConfig.MAX_HP);
    }
}
