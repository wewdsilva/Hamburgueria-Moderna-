package Pedidos;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);

  int opcao = 0;


  Cliente cliente = new Cliente();
  Carne carne = new Carne();
  Complementos complemento = new Complementos();


  System.out.println("\n Seja Bem Vindo a Hamburgueria Moderna \n");
  System.out.println("Realize seu Cadastro\n");
  System.out.print("Informe seu Nome: ");
  cliente.setNome(ler.nextLine());
  System.out.print("Informe seu Endereço (Rua): ");
  cliente.setRua(ler.nextLine());
  System.out.print("Informe o Número da casa: ");
  cliente.setNumero(ler.nextLine());
  System.out.print("Informe o seu Bairro: ");
  cliente.setBairro(ler.nextLine());
  System.out.print("Informe um Telefone para contato: ");
  cliente.setTelefone(ler.nextLine());

  while (opcao != 7) {

   System.out.println("\n ==== Selecione a Opção Desejada ==== \n"
   +"|      Digite 1º Bland de Carne        |\n"
   +"|      Digite 2º Bland de Frango       |\n"
   +"|      Digite 3º Adicionar Verdura     |\n"
   +"|      Digite 4º Adicionar Molho       |\n"
   +"|      Digite 5º Adicionar Queijo      |\n"
   +"|      Digite 6º Imprimir Pedido       |\n"
   +"|      Digite 7º ----- Sair ---        |\n"
   +"|**********************************************************|\n");


   System.out.print("Opção: ");
   opcao = ler.nextInt();


   switch (opcao) {

    case 1:
     carne.opCarne();
     break;

    case 2:
     carne.opFrango();
     break;

    case 3:
     complemento.comVerdura();
     break;

    case 4:
     complemento.comMolho();
     break;

    case 5:
     complemento.comQueijo();
     break;


    case 6:
     System.out.println("\n ======== PEDIDO ========== \n");
     System.out.println("Nome: " + cliente.getNome() + " | " + "Endereço: " + cliente.getRua());
     System.out.println("Numero: " + cliente.getNumero() + " | " + "Bairro: " + cliente.getBairro());
     System.out.println("Telefone: " + cliente.getTelefone());
     System.out.println("Hamburguer: " + carne.getCarne());
     System.out.println("Verdura: " + complemento.getVerdura());
     System.out.println("Molho: " + complemento.getMolho());
     System.out.println("Queijo: " + complemento.getQueijo());

     break;
    default:

    System.out.println("Obrigado Volte Sempre!!");


   }
  }

 }
}