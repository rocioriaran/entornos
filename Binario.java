package binYprinEntornos;
/**
 * 
 * @author <p>rocio</p>
 * @version 1
 *<p> la clase binario principalemnte te dice si el numero que metas por parametros es binario o no, en caso de que no sea te lo transforma a binario. Dependiendo de que metodos
 *uses te puede decir si el numero es decimal, binario, lo puede cambiar o si es valido </p>
 */
public class Binario {


	private long valor;
	/**
	 * <p>constructor </p>
	 */
    public Binario() {

    }
    /**
     * <p> metes el numero binario por parametro en la clase principal al crearlo</p>
     * @param n valor de constructor por parametros
     */

    public Binario(long n) {
        valor = n;
    }
    /**
     * <p>utiliza el metodo toBinario para devolver el valor</p>
     * @param n numero que metes po0r parametro
     */

    public Binario(int n) {
        valor = toBinario(n);
    }
    /**
     * <p>si metes el numero y es 0 o 1 te lo devuelve y si no es te lo cambia a binario</p>
     * @param n numero que metes para comprobar si es binario o no
     * @return te devuelve el numero que has metido o el numero que has metido convertido en binario
     */

    public long toBinario(int n) {
        if (n < 2) {
            return n;
        } else {
            return toBinario(n / 2) * 10 + (n % 2);
        }
    }
    /**
     * <p>getter</p>
     * @return te devuelve el valor que hayas metido por parametro o sin parametros de tu valor
     */

    public long getValor() {
        return valor;
    }
    /**
     * <p>setter, valor va a ser el nuevo valor q le des a Valor</p>
     * @param valor valor nuevo
     */

    public void setValor(long valor) {
        this.valor = valor;

    }
    /**
     * <p>te pasa el numero que des a dceimal</p>
     * @return te devuelve tu numero en decimal
     */

    public int toDecimal() {
        long n = valor;
        int nDec = 0;
        int pos = 0;
        while (n > 0) {
            nDec = nDec + (int) (n % 10) * (int) Math.pow(2, pos);
            pos++;
            n = n / 10;
        }
        return nDec;
    }
    /**
     * <p>te dice si el numero que has metido es valido como binario o no</p>
     * @param n numero que metes para que de true o false dependiendo de si es binario=true o decimal=false
     * @return si es binario true y sino false
     */

    public static boolean esValido(long n) {
        if (n == 0 || n == 1) {
            return true;
        } else {
            int ultima = (int) n % 10;

            return (ultima == 0 || ultima == 1) && esValido(n / 10);

        }
    }
    /**
     * <p>te dice si el valor es valido</p>
     * @return true o false
     */

    public boolean esValido() {
        return esValido(valor);
    }
	
}
