import java.util.Random;

public class StringGeneratorImpl implements StringGeneration {


    public String generateString(int lengthOfPassword) {
        String string = "";
        for (int i = 0; i < lengthOfPassword; i++) {


            char resultOfGenerate = this.generateSymbol();
            string += resultOfGenerate;
        }

        return string;
    }




    private char generateSymbol() {
        int start;
        int finish;

        Random random = new Random();
        int resultOfType = random.nextInt(0, 4);
        switch (resultOfType) {
            case 0:
                start = 'A';
                finish = 'Z' + 1;
                break;
            case 1:
                start = '!';
                finish = '/' + 1;
                break;
            case 2:
                start = 'a';
                finish = 'z' + 1;
                break;
            default:
                start = '0';
                finish = '9' + 1;
                break;

        }


        int number = random.nextInt(start, finish);
        char symbol = (char) number;

        return symbol;


    }

}



