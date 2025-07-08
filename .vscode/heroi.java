public class heroi {

    String nome;
    int idade;
    String tipo;
    void atacar(){
        String ataque = "";
        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "magia";                
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "suriken";
                break;
            default:
                ataque = "um ataque desconhecido";
                break;
        }
        System.out.println("O tipo " + tipo + " atacou usando " + ataque);
    }   
}
