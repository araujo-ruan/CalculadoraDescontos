//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    var scanner = new Scanner(System.in);
            // Fluxo segue para a captura
    System.out.print("Digite o capital inicial: ");
    double capital = scanner.nextDouble();
    System.out.print("Digite a taxa de juros mensal (em %): ");
    double taxa = scanner.nextDouble() / 100;
    System.out.print("Digite o tempo (em meses): ");
    int tempo = scanner.nextInt();

    double montante = capital * Math.pow((1 + taxa), tempo);
    System.out.printf("Montante final: R$ %.2f%n", montante);
    scanner.close();
}
