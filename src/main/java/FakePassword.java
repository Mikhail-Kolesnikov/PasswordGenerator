import java.util.Random;

public class FakePassword implements StringGeneration{

    @Override
    public String generateString(int lengthOfPassword) {




        String string = "";
        for (int i = 0; i < lengthOfPassword; i++) {


            int resultOfGenerate = this.generateFakeSymbol();
            string += resultOfGenerate;
        }

        return string;
    }



    private char generateFakeSymbol() {
        int start;
        int finish;

        Random random = new Random();
        int resultOfType = random.nextInt(0, 4);
        switch (resultOfType) {
            case 0:
                start = '!';
                finish = '?';
                break;
            case 1:
                start = '!';
                finish = '?';
                break;
            case 2:
                start = '!';
                finish = '?';
                break;
            default:
                start = '!';
                finish = '?';
                break;

        }


        int number = random.nextInt(start, finish);
        char symbol = (char) number;

        return symbol;


    }

}

