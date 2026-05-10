public class ProgramaConta {
  public static void main(String[] args){
    Conta ps = new Conta();
    ps.setTitular("José");
    ps.setNumero(5202);
    ps.setSaldo(8906.13);
    ps.sacar(702);
    
    System.out.println("Titular da conta: " + ps.getTitular());
    System.out.println("Numero da conta" + ps.getNumero());
    System.out.println("Dinheiro na conta" + ps.getSaldo());
    ps.deposida(74.1);
    System.out.println("Novo Dinheiro na conta" + ps.getSaldo());
  }
}
