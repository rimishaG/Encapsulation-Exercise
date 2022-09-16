public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(60,true);
        System.out.println("Initial pages count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(8);
        System.out.println("pages printed was " + pagesPrinted + " new total print for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was " + pagesPrinted + " new total print for printer = " + printer.getPagesPrinted());

    }
}
