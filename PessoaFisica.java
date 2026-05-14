public class PessoaFisica extends Pessoa{
  private String Cpf;
  private char sexo;
  
  public String getCpf(){
  return this.Cpf;
 }
  public char getsexo(){
  return this.sexo;
 }
 public void setCpf(String cpf){
  this.Cpf = cpf;
 }
  public void setsexo(char sexo){
  this.sexo = sexo;
}
}