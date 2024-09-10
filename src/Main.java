import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Variaveis//
        String valecard;
        String info;
        String placa;
        int numplaca;

        //Apresentação da empresa//

        valecard = String.format("%nVALECARD %nespecializada em documentação");
        JOptionPane.showMessageDialog(null,valecard,"VALECARD",JOptionPane.INFORMATION_MESSAGE);

        info = String.format("%nBEM VINDO AO CONSULTOR VALECARD %nPara Consultar a data do seu IPVA digite o numero final da sua placa!%nOBS:LEMBRE-SE OS NUMEROS SÃO DE 0 a 9");
        JOptionPane.showMessageDialog(null,info,"CONSULTOR",JOptionPane.INFORMATION_MESSAGE);

        //Coletar informações do usuario//

        placa = JOptionPane.showInputDialog(null,"DIGITE O FINAL DA PLACA","CONSULTAR",JOptionPane.QUESTION_MESSAGE);

        numplaca = Integer.parseInt(placa);

        if (numplaca >=0 && numplaca <=9){

            switch (numplaca){
                case 1:
                    JOptionPane.showMessageDialog(null,"O PAGAMENTO DEVE SER REALIZADO ATÉ 30/04");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"O PAGAMENTO DEVE SER REALIZADO ATÉ 31/05");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"O PAGAMENTO DEVE SER REALIZADO ATÉ 30/06");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"O PAGAMENTO DEVE SER REALIZADO ATÉ 31/07");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"O PAGAMENTO DEVE SER REALIZADO ATÉ 31/08");
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null,"O PAGAMENTO DEVE SER REALIZADO ATÉ 30/09");
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null,"O PAGAMENTO DEVE SER REALIZADO ATÉ 31/10");
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null,"O PAGAMENTO DEVE SER REALIZADO ATÉ 30/11");
                    break;

                case 9:
                case 0:
                    JOptionPane.showMessageDialog(null,"O PAGAMENTO DEVE SER REALIZADO ATÉ 31/12");
                    break;
            }


        }else {

            JOptionPane.showMessageDialog(null,"Digite o numero final da placa corretamente");
        }

    }
    }