import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Main {
  public static void main(String[] args) {
    List<Gasto> gastos = new ArrayList<>();
    gastos.add(new Gasto("Mercado", new Date(), 340.0, "ValeRefeição"));
    gastos.add(new Gasto("Verdureira", new Date(), 100.0, "ValeRefeição"));
    gastos.add(new Gasto("Cabelereiro", new Date(), 600.0, "Dinheiro"));
    gastos.add(new Gasto("GastosCarro", new Date(), 500.0, "Débito"));
    gastos.add(new Gasto("Vestimenta", new Date(), 250.0, "Débito"));
    List<Ganho> ganhos = new ArrayList<>();
    ganhos.add(new Ganho("Salário", new Date(), 2500.0));
    ganhos.add(new Ganho("PJ", new Date(), 1300.0));

    Relatorio relatorio = new Relatorio();
    relatorio.gerarRelatorioDespesas(gastos);
    relatorio.gerarRelatorioReceitas(ganhos);
    relatorio.gerarRelatorioSaldoMensal(ganhos, gastos);
  }