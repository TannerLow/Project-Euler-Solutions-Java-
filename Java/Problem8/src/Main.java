public class Main {

	public static void main(String[] args) {
		String given = "731671765313306249192251196744265747423"
				+ "55349194934969835203127745063262395783180169"
				+ "84801869478851843858615607891129494954595017"
				+ "37958331952853208805511125406987471585238630"
				+ "50715693290963295227443043557668966489504452"
				+ "44523161731856403098711121722383113622298934"
				+ "23380308135336276614282806444486645238749303"
				+ "58907296290491560440772390713810515859307960"
				+ "86670172427121883998797908792274921901699720"
				+ "88809377665727333001053367881220235421809751"
				+ "25454059475224352584907711670556013604839586"
				+ "44670632441572215539753697817977846174064955"
				+ "14929086256932197846862248283972241375657056"
				+ "05749026140797296865241453510047482166370484"
				+ "40319989000889524345065854122758866688116427"
				+ "17147992444292823086346567481391912316282458"
				+ "61786645835912456652947654568284891288314260"
				+ "76900422421902267105562632111110937054421750"
				+ "69416589604080719840385096245544436298123098"
				+ "78799272442849091888458015616609791913387549"
				+ "92005240636899125607176060588611646710940507"
				+ "75410022569831552000559357297257163626956188"
				+ "2670428252483600823257530420752963450";
		
		long start = System.currentTimeMillis();
		String[] givenDigits = new String[1000];
		givenDigits = given.split("(?!^)");
		
		long max = 1;
		int j = 0;
		for(int i = 0; i < 13; i++) 
			max *= Integer.parseInt(givenDigits[i]);
		
		int pos = 0;
		long current = max;
		for(int i = 0; i < givenDigits.length-13-1; i++) {
			current /= Integer.parseInt(givenDigits[i]) + 1;
			current *= Integer.parseInt(givenDigits[i+13])+1;
			if(current>max){
				max = current;
				pos = i;
			}
		}
		max = 1;
		for(int i = pos; i < pos+13; i++){
			max *= Integer.parseInt(givenDigits[i+1]);
		}
		System.out.print(max);
		System.out.println(", in " + (System.currentTimeMillis() - start) + " ms");
	}
}