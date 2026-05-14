public class ProgramaPessoa {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("José");
        pf.setDatanex("10/05/2005");
        pf.setCpf("123.456.789-00");
        pf.setsexo('M');
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Data de nascimento: " + pf.getDataNex());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Sexo: " + pf.getsexo());
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa Alpha");
        pj.setDatanex("01/01/2020");
        pj.setcrpj("12.345.678/0001-99");
        System.out.println("Nome da empresa: " + pj.getNome());
        System.out.println("Data de criação: " + pj.getDataNex());
        System.out.println("CNPJ: " + pj.getcrpj());
    }
}
