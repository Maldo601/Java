
import java.util.Arrays;

public class test {

  // S T R I N G S      B A S I C S    LVL 1 

  // Rotar cadenes.
  static String left2(String str) {
    return str.substring(2, str.length()) + str.substring(0, 2);
  }
  // Rotar cadenes a la dreta "Hello -> loHel"
  static String right2(String str) {
    return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
  }
  // True retorna primer caracter. False últim
  static String theEnd(String str, boolean front) {
    if (front == true)
      return "" + str.charAt(0);
    return str.substring(str.length() - 1);
  }
  // Retallar primer i ultima posicio.
  static String withouEnd2(String str) {
    return (str.length() <= 2) ? "" : str.substring(1, str.length() - 1);
  }
  // Torna els dos caracters de la mitat d'una cadena
  static String middleTwo(String str) {
    String cad = str.substring((str.length() / 2) - 1);
    return cad.substring(0, 2);
    // Torna tres caracters del mig de una cadena:
    // return cad.substring(0,3);
  }
  // Torna boolean si el patro acaba en "ly"
  static boolean endsLy(String str) {
    if (str.length() < 2)
      return false;
    return (str.substring(str.length() - 2).equals("ly")) ? true : false;
  }
  // Torna la cadena tallada per front i back (n)
  static String nTwice(String str, int n) {
    return str.substring(0, n) + str.substring(str.length() - n);
  }
  // Agafa partint de l'index un caracter mes. Si no es possible o l'index passat
  // no es valid, torna els dos primers caracters de la cadena.
  static String twoChar(String str, int index) {
    return (str.length() > index + 1 && index >= 0) ? str.substring(index, index + 2) : str.substring(0, 2);
  }
  /*
   * Retorna true o false si la string conté el patró "bad" al index 0 o 1. Té en
   * compte casos d'error de pas de parametre.
   */
  static boolean hasBad(String str) {
    int i = str.indexOf("bad");
    if (i != -1 && i <= 1)
      return true;
    return false;
  }
  // Un altre exemple de l'anterior proposat per CodingBat diferent al meu.
  static boolean hasBad2(String str) {
    if (str.length() >= 3 && str.substring(0, 3).equals("bad"))
      return true;
    if (str.length() >= 4 && str.substring(1, 4).equals("bad"))
      return true;
    return false;
    // Solution notes: basically want to call substring(0, 3) and
    // substring(1, 4) and check if that equals "bad". Need to check
    // the length first so as to not go off the end of the string.
    // Alternately one could use indexOf() -- that code is short
    // but it runs much slower, since it needlessly checks over the whole
    // string.
  }
  /*
   * Retorna els dos primers caracters. Si nomes hi ha un caracter retorna
   * caracter + @ si no hi ha res, dos arrobes.
   */
  static String atFirst(String str) {
    if (str.equals(""))
      return "@@";
    return (str.length() <= 1) ? str.substring(0) + "@" : str.substring(0, 2);
  }
  /*
   * Retorna la primera lletra de A i la ultima de B Si la cadena es buida es
   * retorna una "@"
   */
  static String lastChars(String a, String b) {
    String cad = "";
    if (a.equals("") && b.equals(""))
      return "@@";
    if (a.equals("")) {
      cad = "@";
      return cad + b.substring(b.length() - 1);
    }
    if (b.equals("")) {
      cad = a.charAt(0) + "@";
      return cad;
    }
    return a.charAt(0) + b.substring(b.length() - 1, b.length());
  }
  // Concatena les dos parts. Si el final de "a" es == al principi de "b", elimina
  // el caracter.
  static String conCat(String a, String b) {
    if (a.equals(""))
      return b;
    if (b.equals(""))
      return a;
    if (a.substring(a.length() - 1).equals("" + b.charAt(0)))
      return a + b.substring(1);
    return a + b;
  }
  // Permutar la posicio dels dos ultims caracters i contempla la nulitat o
  // monocaracter
  static String lastTwo(String str) {
    if (str.length() >= 2) {
      String cad = str.substring(0, str.length() - 2);
      String last = str.substring(str.length() - 1);
      String pre = str.substring(str.length() - 2);
      return cad + last + "" + pre.charAt(0);
    }
    if (str.length() == 0)
      return "";
    return str;
  }
  // Retorna el color si apareix al principi de la cadena:
  static String seeColor(String str) {
    if (str.indexOf("red") == 0)
      return "red";
    if (str.indexOf("blue") == 0)
      return "blue";
    return "";
  }
  // Retorna true si els dos primers caracters son iguals als dos ultims caracters
  static boolean frontAgain(String str) {
    if (str.length() < 2)
      return false;
    return (str.substring(0, 2).equals(str.substring(str.length() - 2))) ? true : false;
  }
  // Retorna una cadena concatenada a la mesura de la mes petita passada
  static String minCat(String a, String b) {
    if (a.length() > b.length())
      return a.substring(a.length() - b.length()) + b;
    else if (a.length() < b.length())
      return a + b.substring(b.length() - a.length());
    return "";
  }
  // Retorna 3 vegades els dos primers caracters. Si es mono caracter 1.
  static String extraFront(String str) {
    String cad = "";
    for (int i = 0; i < 3; i++) {
      if (str.length() > 1)
        cad += str.substring(0, 2);
      else if (str.length() == 1)
        cad += str.substring(0);
    }
    return cad;
  }
  // Si els dos primers caracters son iguals als dos ultims, lleva els primers dos
  // i torna str.
  // Si no, torna cadena sencera
  static String without2(String str) {
    if (str.length() == 1)
      return String.valueOf(str.charAt(0));
    else if (str.equals(""))
      return "";
    if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
      return str.substring(2, str.length());
    return str;
  }
  // Porta Booleana.
  /*
   * Si teniu una cadena, torneu una versió sense els 2 primers caràcters. Excepte
   * guardeu el primer caràcter si és "a" i mantingueu el segon caràcter si és
   * "b". La corda pot tenir qualsevol longitud. Més difícil del que sembla
   */
  static String deFront(String str) {

    if (str.charAt(0) == 'a' && str.charAt(1) != 'b')
      return str.replaceFirst("" + str.charAt(1), "");

    if (str.charAt(1) == 'b' && str.charAt(0) != 'a')
      return str.substring(1);

    if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.length() <= 3)
      return str;

    if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.length() > 3)
      return str;

    if (str.charAt(0) != 'a' && str.charAt(1) != 'b' && str.length() > 2)
      return str.substring(2);

    return "";
  }
  /*
   * Retorna una cadena de la longitud de la segona paraula on si la primera
   * lletra no es igual a la de la primera paraula, es permuta a aquesta, aquest
   * caracter. Si les lletres seguents, alguna no coincideix amb el contingut de
   * la primera, es retorna cadena buida. Mes info al penultim exercici de Strings
   * 1 de codeBat.
   */
  static String startWord(String str, String word) {

    if (!str.contains(word.substring(1, word.length())))
      return "";

    if (str.length() < word.length())
      return "";

    if (str.contains(word))
      return str.substring(0, word.length());

    if (str.charAt(0) != word.charAt(0))
      return word.replaceFirst("" + word.charAt(0), "" + str.charAt(0));

    return "";
  }
  /*
  Si es dóna una cadena, si el primer o l'últim caràcter són 'x', torneu la cadena sense aquests caràcters 'x' 
  i, en cas contrari, torneu la cadena sense canvis.
  */
  static String withoutX(String str) {
    if (str.length() < 2)
      return "";      
    if (str.charAt(0) == 'x' && str.substring(str.length()-1).equals("x") )
      return str.substring(1,str.length()-1);
    else if (str.charAt(0) =='x')
      return str.substring(1);
    else if (str.substring(str.length()-1).equals("x"))
      return str.substring(0,str.length()-1);
    return str;
  }
  /*
    Elimina el primer i el segon caracter si son una "x". Torna la cadena del resto.
  */
  static String withoutX2(String str) {
    if ( str.length() < 2)
      return "";
    if (str.charAt(0) == 'x' && str.charAt(1) == 'x')
      return str.substring(2);
      else if (str.charAt(0) != 'x' && str.charAt(1) != 'x')
        return str;
    return str.replaceFirst("x", "");
  }

  // B O O L E A N      B A S I C S  LVL 1 

  /* 
    Retorna true o false si entre semana uns esquirols tenen entre 40 i 60 cigarrros. 
    en fi de setmana esta gent no te limit 
  */
  static boolean cigarParty(int cigars, boolean isWeekend) {
    if ( isWeekend == false && cigars > 60 )
      return false;
    return ( cigars >= 40 ) ? true : false ;
  }
  /*
    Parelles al restaurant i elegancia de la roba per elegir taula. 
    Si una parella te una puntuacio de menos de 2 o 2, se retorna 0
    Si es te una puntuacio de mes de 8 i l'altre mes de dos es retorna 1
    Si es un barriobajero algu dels dos, es retorna una puntuacio de 0 i sels fot fora del restaurantç
  */
  static int dateFashion(int you, int date) {
    if (you <=2 || date <=2)
        return 0;
    if (you >= 8 || date >=8)
      return 2;
    return 1;
  }
  /*
    Si el valor es true, rango entre 60 y 100. Si es false el verano, 60-90
  */
  static boolean squirrelPlay(int temp, boolean isSummer) {
    if(isSummer == true)
      return (temp >= 60 && temp <= 100) ? true : false;
    return (temp >= 60 && temp <=90) ? true : false;
  }
  /*
    Multes de transit. Si es el teu cumple pots correr 5 punts mes. Si no, apareixen 
    les seguents limitacions que retornen un enter representant la magnitud de la multa. 
      - Si es true, li restem 5 punts a speed per treballar mes facil i no alterar valors finals. 
  */
  static int caughtSpeeding(int speed, boolean isBirthday) {
    if (isBirthday == true)
      speed -= 5;
      else if (speed <= 60)
        return 0;
          else if (speed >= 61 && speed <= 80)
            return 1;
    return 2;
  }
  /*
    Si la suma de a i b esta entre 10 i 19, retorna 20. Tot el resto es suma normal
  */
  static int sortaSum(int a, int b) {
    return((a + b) <= 19 && (a+b) >=10) ? 20 : a+b;
  }
  /*
    Alarma que retorna unes condicions horaries i festives
  */
  static String alarmClock(int day, boolean vacation) {
  if (vacation == true && (day == 6 || day == 0 ))
    return "off";
    else if (vacation == false && (day == 6 || day == 0))
      return "10:00";
    else if (vacation == true && day >= 1 && day < 6)
      return "10:00";
  return "7:00";
}
  /* 
    Torna true o false si "a" + o - "b" == 6 absolut
  */
  static boolean love6(int a, int b) {
  return (a == 6 || b == 6 || Math.abs(a-b) == 6 || a+b == 6) ? true : false;
}
  /*
    Retorna true o false depenent de l'estat de outsideMode i dels numeros
  */
  static boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode == false && n <= 0)
    return false;
    else if ( (n >= 1 && n <= 10) && outsideMode == false)
      return true;
      else if ( n <= 1 || n >= 10 && outsideMode == true)
        return true;
  return false;
}
  /*
    Torna true si es multiple de 11 o si n+1 tambe ho es. El resto a false.
  */
  static boolean specialEleven(int n) {
    return  ( n % 11 == 0 || n % 11 == 1 ) ? true : false;
}
  /*
    Torna true si n+1 o n+2 es multiple de 20.
  */
  static boolean more20(int n) {
    return ( n % 20 == 1 || n % 20 == 2 ) ? true : false;
  }
  /* Torna true si "n" es multiple de 5 o de 3, pero no dels dos alhora. */
  static boolean old35(int n) {
    if ( n % 5 == 0 && n % 3 == 0 )
      return false;
    return ( n % 5 == 0 || n % 3 == 0) ? true : false;
  }
  /*
    Torna true si n+1 o n+2 es %20 !!! OJO EN LOS PARENTESIS !!! 
  */
  static boolean less20(int n) {
  if ( (n+1) % 20 == 0 || (n+2) % 20 == 0)
    return true;
  return false;
}
  /* 
    Retorna true o false si el numero +2 esta a residu 4 o menos
  */
  static boolean nearTen(int num) {
    return ( (num+2) % 10 <= 4) ? true : false;
}
  /*
    Retorna 19 o la suma dels dos 
  */
  static int teenSum(int a, int b) {
    return ((a >= 13 && a <= 19) || (b >= 13 && b <=19 ) ) ? 19 : a+b;
}
  /* 
    Sona el telèfon mòbil. Torneu a cert si heu de respondre-ho. Normalment responeu, 
    excepte que al matí només responeu si la vostra mare truca. En tots els casos, 
    si estàs adormit, no respon
  */
  static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if(isAsleep)
      return false;
    return (isMorning && !isMom) ? false : true;
  }
  /*
    Tea Party. 
  */
  static int teaParty(int tea, int candy) {
    if ((tea < 5 || candy < 5))
      return 0;
    if (tea >= candy*2 || candy >= tea*2)
      return 2;
  return 1;
}
  /*
    Return "Fizz" or "Buzz" or "FizzBuzz" or str if starts with "F" or ends with "B" or F && B 
  */
  static String fizzString(String str) {
    if (str.charAt(0) == 'f' && str.substring(str.length()-1).equals("b"))
      return "FizzBuzz";
        else if (str.charAt(0) == 'f')
          return "Fizz";
        else if (str.substring(str.length()-1).equals("b"))
          return "Buzz";
    return str;
}
  /*
    Si es divisible per 3 -> Fizz ! 
    Si es divisible per 5 -> Buzz !
    Els dos               -> FizzBuzz !
    else                  -> num + ! 
  */
  static String fizzString2(int n) {
    String car = "!";
      if (n%3 == 0 && n%5 == 0)
        return "FizzBuzz" + car;
      else if (n%3 == 0)
        return "Fizz" + car;
      else if (n%5 == 0)
        return "Buzz" + car;
    return ""+n+car;
}
  /*
    Si en a o b se pot formar c, torna true o false.
  */
  static boolean twoAsOne(int a, int b, int c) {
    return (a+b == c || Math.abs(a-b) == c || b - a == c) ? true : false;
  }
  /*
    No cal explicarlo massa. 
  */
  static boolean inOrder(int a, int b, int c, boolean bOk) {
    return ( b > a && b < c && bOk == false ) || ( b < c && bOk == true) ? true : false;
  }
  /*
    Retorna true si els numeros estan estrictament en ordre ascendent si equal OK es fals.
    Si es true, permet la igualtat de numeros sempre i quan estiguen ascendents.
    Tot el resto a false.
  */
  static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    return (a < b && b < c && equalOk == false ) || ( equalOk == true && a <= b && b <= c)
    ? true
    : false ;
}
  /*
    Retorna True o False si el resto es igual al resto dels numeros de la dreta. 
  */
  static boolean lastDigit(int a, int b, int c) {
    return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) 
            ? true 
            : false ;
  }
  /*
    Retorna true o false si un dels numeros es 10 menor que els altres
  */
  static boolean lessBy10(int a, int b, int c) {
    return (Math.abs(a-b) >= 10 || Math.abs(a-c) >= 10|| Math.abs(b-c) >= 10) 
            ? true
            : false ;
  }
  /*
    
  */
  static int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if(noDoubles && die1 == die2) {
      die1++;
        if(die1 == 7)
         die1 = 1;
    }
    return die1 + die2;
  }
  /*
    Retorna el numero mes gran dels dos 
  */
  static int maxMod5(int a, int b) {
  if(a == b)
   return 0;
    else if(a % 5 == b % 5)
      return (a < b) ? a 
                     : b;
    return a > b ? a : b;
}
  /*
    Retorna
  */
  static int redTicket(int a, int b, int c) {
   if(a == 2 && b == 2 && c == 2)
        return 10;
          
    if(a == b && b == c)
        return 5;
                    
    if(a != b && a != c)
        return 1;
                            
    return 0;
  }
  /*
  
  */
  static int greenTicket(int a, int b, int c) {
    if ( a != b && b != c && a != c )
      return 0;
      else if ( a == b && b == c && a == c)
        return 20;
      return 10;
}
  /*
  
  */
  static int blueTicket(int a, int b, int c) {
    int ab = a + b;
    int bc = b + c;
    int ac = a + c;
        
    if(ab == 10 || bc == 10 || ac == 10)
        return 10;          
      else if(ab == bc + 10 || ab == ac + 10)
          return 5;                    
    return 0;
}
  /*
  
  */
  static boolean shareDigit(int a, int b) {
    int al = a / 10;
    int ar = a % 10;
    int bl = b / 10;
    int br = b % 10;
    return al == bl || al == br || ar == bl || ar == br;
}
  /*
  
  */
  static int sumLimit(int a, int b) {
  int sum = a + b;
    int aLength = String.valueOf(a).length();
    int sumLength = String.valueOf(sum).length();
        
    if(sumLength == aLength)
        return sum;
                  
    return a;
}
// L O G I C     II
static int luckySum(int a, int b, int c) {
  /*
  Donats 3 valors int, a b c, retornen la seva suma. 
  Tanmateix, si un dels valors és 13, llavors no compta per a la suma i els valors 
  a la seva dreta no compten. Per exemple, si b és 13, tant b com c no compten.
  */
  if (a == 13)
    return 0;
  else if (b == 13)
    return a;
  else if (c == 13)
    return a + b;
  return a + b + c;
}
// Retorna la suma dels numeros menos si son un rango de 13 a 19 sense contar 15 i 16
static int fixTeen( int n ){
  if (n >= 13 && n <= 19 && n != 15 && n != 16)
    return 0;
  return n;
}
static int noTeenSum(int a, int b, int c) {
    return fixTeen(a) + fixTeen(b) + fixTeen(c);
}
// Redondeja de 5 cap al 10 o cap al 0
static int round10 (int num) {
  int round = num % 10;
  if (round >= 5)
   return  num + 10 - round;
  return num - round;
}
static int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}
// Retorna el valor mes proper a 21 sense pasarse per damunt d'este.
static int blackjack(int a, int b) {
  if ( a > 21 && b > 21 )
    return 0;
    else if (b == 21)
      return b;
    else if (a == 21)
      return a;
    else if ( a > 21 && b < 21)
      return b;
    else if ( b > 21 && a < 21)
      return a;
  return (21 - a > 21 - b) ? b : a;
}
static boolean evenlySpaced(int a, int b, int c) {
  /*
  Donades tres ints, a b c, una d’elles és petita, una de mitjana i una de gran. 
  Torneu a cert si els tres valors estan espaiats uniformement, de manera que la 
  diferència entre petit i mitjà és la mateixa que la diferència entre mitjà i gran.
  */
    int temp;
    if(a > b) {
        temp = a;
        a = b;
        b = temp;
    }
                    
    if(b > c) {
        temp = b;
        b = c;
        c = temp;
    }
                                      
    if(a > b) {
        temp = a;
        a = b;
        b = temp;
    }
                                                        
    return b - a == c - b;
}






  //       A  R  R  A  Y  S     C O D I N G B A T 
  /*
    Mira si el vector te el primer valor i l'ultim valor son iguals 
    i si el vector te un punt mes de llargaria. En estos casos torna true
    i si no false. 
  */
  static boolean sameFirstLast(int[] nums) {
    if (nums.length < 1)
      return false;
    return (nums.length >= 1 && (nums[0] == nums[nums.length-1])) ? true : false;
  }
  /*
    Plena un vector 
  */
  static int[] makePi() {
    int v[] = {3,1,4};
    return v;
  }
  /*
    Retorna true si el primer o ultim valor del primer vector es igual al primer valor o ultim
    valor del segon vector
  */
  static boolean commonEnd(int[] a, int[] b) {
    int Afirst = a[0];
    int Aback = a[a.length-1];
    int Bfirst = b[0];
    int Bback = b[b.length-1];
      return (Afirst == Bfirst || Aback == Bback) ? true : false;
  }
  /*
    Retorna la suma de tots los valors del vector a un counter. 
  */
  static int sum3(int[] nums) {
    int counter = 0;
    for (int i = 0; i < nums.length; i++)
      counter += nums[i];
    return counter;
  }
  /*
    Permutar primer valor i ultim del array en una variable auxiliar
  */
  static int[] reverse3(int[] nums) {
    int aux = nums[nums.length-1];
    nums[nums.length-1] = nums[0];
    nums[0] = aux;
    return nums;
  }
  /*
    Donada una matriu de longitud de 3 ints, esbrineu quin és el primer o l'últim element de 
    la matriu més gran i configureu tots els altres elements perquè siguin aquest valor. 
    Retorna la matriu modificada.

    Esta versio es escalable. La del coding bat es limita a una llargaria de Array de 3. 
  */
  static int[] maxEnd3(int[] nums) {
    int aux = nums[0] > nums[nums.length-1] ? nums[0] : nums[nums.length-1];
    for (int i = 0; i < nums.length; i++)
      nums[i] = aux;
    return nums;
  }
  /*
    Donada una matriu d’ints, retorneu la suma dels 2 primers elements de la matriu. Si la 
    longitud de la matriu és inferior a 2, només cal resumir els elements que existeixen, 
    retornant 0 si la matriu és de longitud 0.
  */
  static int sum2(int[] nums) {
    if (nums.length >= 2)
      return nums[0] + nums[1];
    return (nums.length < 1) ? 0 : nums[0];
  }
  /*
    Torna en un nou Array el valor del mig.
  */
  static int[] middleWay(int[] a, int[] b) {
    int v[] = {a[1],b[1]};
    return v;
  }
  /*
    Retorna un array nou on li passem el primer valor i ultim del que li passem
    a la funció.
  */
  static int[] makeEnds(int[] nums) {
    int v[] = {nums[0],nums[nums.length-1]};
    return v;
  }
  /*
    Donat un Array de 2 posicions, retorna true si conte un dos o un tres. 
    Si no, false. 
  */
  static boolean has23(int[] nums) {
    for (int i = 0; i < nums.length; i++){
      if ( nums[i] == 2 || nums[i] == 3 )
        return true;
    }
    return false;
  }
  /*
    Lo mateix pero en inversio de condicions. Podem posar != mantenint els returns
    o directament podem cambiar els returns.
  */
  static boolean no23(int[] nums) {
    for (int i = 0; i < nums.length; i++){
      if (nums[i] == 2 || nums[i] == 3)
        return false;
    }
    return true;
  }
  /*
    Si es dóna una matriu int, torneu una matriu nova amb el doble de longitud on el 
    seu darrer element sigui el mateix que la matriu original i tots els altres elements 
    siguin 0. La matriu original tindrà una longitud 1 o més. Nota: per defecte, una nova 
    matriu int conté tots els 0.
  */
  static int[] makeLast(int[] nums) {
    int v[] = new int [nums.length * 2];
    v[v.length-1] = nums[nums.length-1];
    return v;
  }
  /*
    Donat un array int, torneu a true si el array conté 2 dues vegades o 3 dues vegades. 
    La matriu tindrà una longitud 0, 1 o 2.
  */
  // Una de les maneres mes efectives i escalables de fer aixo es la següent, pero el coding bat es idiota 
  static boolean double23(int[] nums) {
    for (int i = 1; i < nums.length; i++){
      if (nums[i] == nums[i-1])
        return true;
    }
    return false;
  }
    // laltra que tambe es valida i no va és:
    static boolean double23v1(int[] nums) {
      if (nums.length < 2 )
        return false;
        else if (nums[0] == nums[1])
          return true;
      return false;
    }
    // La que si que accepta és: 
    static boolean double23v2(int[] nums) {
      int count2 = 0;     int count3 = 0;  
      for(int i = 0; i < nums.length; i++) {
          if(nums[i] == 2)
              count2++;            
          if(nums[i] == 3)
              count3++;
      }                              
      return count2 == 2 || count3 == 2;
    }
  /*
    Donada una longitud de la matriu int 3, si hi ha un 2 a la matriu immediatament 
    seguit d'un 3, establiu l'element 3 a 0. Torneu la matriu modificada
  */
  static int[] fix23(int[] nums) {
    for (int i = 1; i < nums.length; i ++){
      if (nums[i] == 3 && nums[i-1] == 2)
          nums[i] = 0;
    }
    return nums;
  }
  /*
    Comenceu amb 2 matrius int, a i b, de qualsevol longitud. Retorna quantes de les 
    matrius tenen 1 com a primer element.
  */
  static int start1(int[] a, int[] b) {
    int counter = 0;
    for (int i = 0; i < a.length; i++){
      if(a[i] == 1)
      counter++;
    }
    for (int i = 0; i < b.length; i++){
      if (b[i] == 1)
      counter++;
    }
    return counter;
  }
  /*
    Retorna de dos Arrays passats, l'Array que te la suma del seu contingut mes gran
  */
  static int[] biggerTwo(int[] a, int[] b) {
    if(a[0] + a[1] < b[0] + b[1])
          return b;
      return a;
  }
  /*
    Torna en un array nou, els dos numeros de la mitat del array original.
  */
  static int[] makeMiddle(int[] nums) {
    int v[] = {nums[ (nums.length/2)-1 ], nums[ (nums.length/2)]};
    return v;
  }
  /*
    Copiar dos Arrays a un. En el primer metode veurem que si son longituds 
    d'Array iguals, podem fer servir el seguent bucle.
    Si no, es mes convenient usar la classe Arrays.Copy.
  */
  static int[] plusTwo(int[] a, int[] b) {
    int v [] = new int [a.length+b.length];
    for (int i = 0; i < a.length; i++){
      v[i] += a[i];
      v[i+a.length] = b[i];
    }
    return v;
  }
  static int[] plusTwov1(int[] a, int[] b) {
    // Es dona llargaria al nou Array.
    int v [] = new int [a.length+b.length];
    // Parametros: "Array 1", "Inici Array 1", "ArrayDestí", "Posicio d'inici a Array destí", "longitud a copiar"
    System.arraycopy(a, 0, v, 0, a.length);
    // Parametros: "Array 2", "Inici Array 2", "A partir d'on es comença a copiar", "longitud a copiar"
    System.arraycopy(b, 0, v, a.length, b.length);
    return v;
  }
  /*
    Permutar 1er valor per ultim i visceversa en un array, usant aux.
  */
  static int[] swapEnds(int[] nums) {
    int aux;
    aux = nums[0];
    nums[0] = nums[nums.length-1];
    nums[nums.length-1] = aux;
    return nums;
  }
  /*
    Donada una matriu d’intes de longitud senar, torneu una nova longitud de matriu 3
    que contingui els elements del centre de la matriu. La longitud de la matriu serà com a mínim de 3.
    Serveix per a totes les mides de un vector.
  */
  static int[] midThree(int[] nums) {
    int v[] = {nums[nums.length/2-1], nums[nums.length/2],nums[nums.length/2+1]};
    return v;
  }
  /*
     Extreu el valor mes gran comparant la [0], la final i la meitat del Array
  */
  static int maxTriple(int[] nums) {
    return Math.max( 
              Math.max(nums[0],nums[nums.length-1]), 
              Math.max(nums[nums.length-1], nums[nums.length/2]));
  }
  /*
    Retorna els dos primers elements del Array. Si es mes petit a 2 hem de moure el pase 
    de parametros baix del condicional.
  */
  static int[] frontPiece(int[] nums) {
    if (nums.length < 2)
      return nums;
    int v[] = {nums[0],nums[1]};
    return v;
  }
  /*
    Direm que un 1 immediatament seguit d'un 3 en una matriu és un "desafortunat" 1. Torneu cert 
    si la matriu donada conté un 1 desafortunat en les primeres 2 o 2 darreres posicions de la matriu.
  */
  static boolean unlucky1(int[] nums) {
    for (int i = 1; i < nums.length; i++){
      if ( (nums[i] == 3 && nums[i-1] == 1) )
        return true;
        else if (nums[i] == 1 && nums[nums.length-2] == 3 )
          return false;
    }
    return false;
  }
  /*
    Retorna una nova longitud de matriu 2 que contingui, tant com s'ajusti, els elements de a seguits dels elements de b. 
    Les matrius poden tenir qualsevol longitud, inclòs 0, però hi haurà 2 o més elements disponibles entre les dues matrius.
  */
  static int[] make2(int[] a, int[] b) {
    int[] arr = new int[2];
      int count = 0;
      int i;
          
      i = 0;
      while(count < 2 && i < a.length) {
          arr[count] = a[i];
          count++;
          i++;
      }
                              
      i = 0;
      while(count < 2 && i < b.length) {
          arr[count] = b[i];
          count++;
          i++;
      }
                                                  
      return arr;
  }
  /*
    Meh
  */
  static int[] front11(int[] a, int[] b) {
    if(a.length > 0 && b.length > 0) {
          return new int[] {a[0], b[0]};
      } else if(a.length > 0) {
          return new int[] {a[0]};
      } else if(b.length > 0) {
          return new int[] {b[0]};
      }          
      return new int[0];
  }
  
//    A R R A Y S     II


  // Retorna un counter en la quantitat de parells a l'Array:
  static int countEvens(int[] nums) {
    int counter = 0;
    for ( int i = 0; i < nums.length; i ++ ){
      if ( nums[i] % 2 == 0)
        counter++;
    }
    return counter;
  }
  // Resta absolutament el valor mes petit i mes gran del Array. 
  static int bigDiff(int[] nums) {
    Arrays.sort(nums);
    return Math.abs (nums[0] - nums[nums.length-1]);
  }
  static int sum13(int[] nums) {
    /*
    Retorna la suma dels números de la matriu, retornant 0 per a una matriu buida. 
    Llevat que el número 13 és molt desafortunat, de manera que no compta i els 
    números que arriben immediatament després d'un 13 tampoc no compten.
    */
    int sum = 0;
    int i = 0;
      while(i < nums.length) {
          if(nums[i] == 13)
            i += 2;
           else {
            sum += nums[i];
            i++;
          }
      }
      return sum;
  }
  // No suma el rango comprès entre 6 o 7. 
  public int sum67(int[] nums) {
    int sum = 0;
    boolean inRange = false;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 6)
            inRange = true;

        if(!inRange)
            sum += nums[i];
                                        
        if(inRange && nums[i] == 7)
            inRange = false;
    }
    return sum;
}
// Retorna true o false si hi han 2 2 junts
static boolean has22(int[] nums) {

  for (int i = 1; i < nums.length; i++){
    if (nums[i-1] == 2 && nums[i] == 2)
      return true;
  }
  return false;
}
// Retorna true o false si no hi ha 1 ni 3
static boolean lucky13(int[] nums) {
  for ( int i = 0; i < nums.length; i++){
    if (nums[i] == 1 || nums [i] == 3)
      return false;
  }
  return true;
  }
// Si tots els dos del array tornen 8, retorna true, si no retorna false;
static boolean sum28(int[] nums) {
  /* Suma nomes els dos de la matriu i si dona 8 retorna true. */
  int sum = 0;
  for ( int i = 0; i < nums.length; i ++){
    if ( nums[i] == 2)
      sum += nums[i];
  }
  return ( sum == 8) ? true : false;
}
// Retorna true si el numero de 1ns es mes gran que el de cuatres
static boolean more14(int[] nums) {
  int countOne = 0;
  int countFour = 0;
  for ( int i = 0; i < nums.length; i ++) {
    if (nums[i] == 1)
      countOne++;
    if(nums[i] == 4)
      countFour++;
  }
  return ( countOne > countFour) ? true : false;
}
// Ompli un array del 0 fins a la seua llargaria 1 a 1.
static int[] fizzArray(int n) {
  int v[] = new int [n];
  int omple = 0;
  for (int i = 0; i < v.length; i++){
    v[i] = omple;
    omple++;
  }
  return v;
}
// Torna true si tots els numeros del Array son 1 o 4.
static boolean only14(int[] nums) {
  for ( int i = 0; i < nums.length; i ++){
    if ( nums[i] != 1 && nums[i] != 4)
      return false;
  }
  return true;
}
// Ompli un array del 0 hasta la seua llargaria, pero en versio String.
static String[] fizzArray2(int n) {
  String v[] = new String[n];
  for (int i = 0; i < v.length; i ++){
    v[i] = String.valueOf(i);
  }
  return v;
}
// Si conte 1 i 4 retorna false. Un dels dos sols es true.
static boolean no14(int[] nums) {
  boolean countOne =false;
  boolean countFour = false;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 1)
      countOne = true;
    if (nums[i] == 4)
      countFour = true;
  }
  return !countOne || !countFour;
}
static boolean isEverywhere(int[] nums, int val) {
  for(int i = 0; i < nums.length - 1; i++) {
      if(nums[i] != val && nums[i + 1] != val)
          return false;
  }
              
  return true;
}
// Comprova que no hi haguen dos dos seguits i cuatre cuatre seguit. El resto true.
static boolean either24(int[] nums) {
  boolean dos = false;
  boolean cuatre = false;
  for ( int i = 0; i < nums.length -1; i++ ){
    if ( nums[i] == 2 && nums [i+1] == 2 )
      dos = true;
    else if( nums [i] == 4 && nums [i+1] == 4)
      cuatre = true;
  }
  return dos != cuatre;
}
static int matchUp(int[] nums1, int[] nums2) {
  int counter = 0;
   for(int i = 0; i < nums1.length; i++) {
       if(Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i])
           counter++;
   }
   return counter;
}
// retorna true si te 7 al costat o una posicio +1
static boolean has77(int[] nums) {
  for (int i = 0; i < nums.length-1; i++){
    if (nums[i] == 7 && nums[i+1] == 7)
    return true;
  }
  for (int i = 0; i < nums.length-2; i++){
    if (nums [i] == 7 && nums[i+2] == 7)
    return true;
  }
  return false;
}
 /*
  Si es dóna una matriu d’ints, torneu true si hi ha un 1
  a la matriu amb un 2 en algun lloc posterior de la matriu.
*/
static boolean has12(int[] nums) {
 
  boolean first = false;

  for ( int i = 0; i < nums.length; i++){
    if (nums[i] == 1)
      first = true;
    if(nums[i] == 2 && first )
      return true;
  }
  return false;
}
// Comprova que tres numeros seguits del array siguen parells 
static boolean modThree(int[] nums) {
  if(nums.length < 3)
        return false;
          
    for(int i = 0; i <= nums.length - 3; i++) {
        if(nums[i] % 2 == nums[i+1] % 2 && nums[i] % 2 == nums[i+2] % 2)
            return true;
    }
    return false;
}
// Torna true si el valor 3 apareix 3 vegades en l'Array
static boolean haveThree(int[] nums) {
  int counter = 0;
  if (nums.length < 3)
    return false;
  if (nums[0] == 3)
    counter++;
  for ( int i = 1 ; i < nums.length; i ++){
    if (nums[i-1] != 3 && nums[i] == 3 )
      counter++;
  }
  return (counter == 3) ? true : false;
}
// Retorna true o false si els numeros del davant son iguals als dels de detras en base a "len";
static boolean sameEnds(int[] nums, int len) {
  for(int i = 0; i < len; i++) {
      if(nums[i] != nums[nums.length - len + i])
          return false;
  }            
  return true;
}
// Retorna true si hi han tres numeros en ordre creixent
static boolean tripleUp(int[] nums) {
  /*
  Torneu cert si la matriu conté, en algun lloc, 
  tres nombres adjacents creixents com .... 4, 5, 6, ... o 23, 24, 25.
  */
  for (int i = 0; i <= nums.length-3; i++){
    if (nums[i] + 1 == nums[i+1] && nums[i+1] +1 == nums[i+2])
      return true;
  }
  return false;
}






























// S T R I N G  I I 
static String doubleChar(String str) {
  /*
  Si teniu una cadena, torneu una cadena on hi 
  hagi dos caràcters per a cada caràcter de l'original.
  */
  String cad = "";
  for ( int i = 0; i < str.length(); i++){
    cad += ""+str.charAt(i) + str.charAt(i);
  }
  return cad;
}
// Retorna un counter per cada vegada que apareix "hi"
static int countHi(String str) {
  int counter = 0;
  for (int i = 0; i < str.length()-1; i++){
    if ( str.substring(i, i+2).equals("hi"))
      counter++;
  }
  return counter;
}
// Retorna true o false si "cat" apareix les mateixes vegades que "dog"
static boolean catDog(String str) {
  int dog = 0;
  int cat = 0;
  for ( int i = 0; i < str.length()-2; i++){
    if (str.substring(i,i+3).equals("cat"))
      cat++;
    if (str.substring(i,i+3).equals("dog"))
      dog++;
  }
  return (dog == cat) ? true : false;
}
static int countCode(String str) {
  /*
  Torneu el nombre de vegades que apareix la 
  cadena "codi" en qualsevol lloc de la cadena donada, excepte
  que acceptarem qualsevol lletra per a la "d", 
  de manera que es compten "cope" i "cooe".
  */
  int counter = 0;
  for (int i = 0; i < str.length()-3; i++){
    if (str.substring(i,i+2).equals("co") && str.charAt(i+3) == 'e')
      counter++;
  }
  return counter;
}
static boolean endOther(String a, String b) {
  /*
  torneu a true si alguna de les cadenes apareix al final de 
  l'altra cadena, ignorant les diferències entre majúscules 
  i minúscules (en altres paraules, el càlcul no hauria de ser "sensible a majúscules"). 
  Nota: str.toLowerCase () retorna la versió en minúscula d’una cadena.
  */
    if(a.length() < b.length()) {
        String temp = a;
        a = b.toLowerCase();
        b = temp.toLowerCase();
    }
    return a.substring(a.length() - b.length()).equals(b);
}
static boolean xyzThere(String str) {
  /*
  Torneu a true si la cadena indicada conté una aparença 
  de "xyz" on el punt (.) No va precedit directament del xyz. 
  Per tant, "xxyz" compta, però "x.xyz" no.
  */
 if(str.length() >= 3 && str.substring(0, 3).equals("xyz"))
        return true;
          
    for(int i = 1; i < str.length() - 2; i++) {
        if(str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz"))
            return true;
    }
                          
    return false;
}
// Retorna true si conte "b" + caracter aleatori + "b"
static boolean bobThere(String str) {
  for (int i = 0; i < str.length()-2; i ++){
    if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
      return true;
  }
  return false;
}
static boolean xyBalance(String str) {
  /*
  Direm que una cadena té un equilibri xy si per a tots 
  els caràcters 'x' de la cadena, hi ha un caràcter 'y' 
  en algun lloc posterior de la cadena. Per tant, "xxy" 
  és equilibrat, però "xyx" no. Una "y" pot equilibrar 
  diverses "x". Retorna el valor vertader si la cadena donada té un equilibri xy.
  */
  boolean firstY = false;
  /*
  Com la validació ocurrix en Y's al final, usarem un decremental 
  per comprovar-ho. Així evitem primer els problemes de trobar una Y
  al principi d'un bucle normal, que ens farien validarlo sencer.
  */
  for ( int i = str.length()-1; i >= 0; i --){
    if(str.charAt(i) == 'y')
    firstY = true;
    // Si troba "X" pero cap Y al final de la cadena on comencem a contar
    // no valida.
    if(str.charAt(i) == 'x' && firstY == false)
    return false;
  }
  return true;
}
// Replenar posicio duna cadena i posicio de laltra a un array
static String mixString(String a, String b) {
  
  char[] arr;
  String end;
  int count = 0;
      
  if(a.length() < b.length()) {
      arr = new char[2 * a.length()];
      end = b.substring(a.length());
  } else {
      arr = new char[2 * b.length()];
      end = a.substring(b.length());
  }
  for(int i = 0; i < arr.length / 2; i++) {
      arr[count] = a.charAt(i);
      count++;
      arr[count] = b.charAt(i);
      count++;
  }
  return new String(arr) + end;
}
// Torna les posicions finals de str en base a un numero "n" i les concatena "n" vegades
static String repeatEnd(String str, int n) {
  String cad = "";
  String take = str.substring(str.length()-n);
  for (int i = 0; i < n; i++){
    cad += take;
  }
  return cad;
}
// El mateix que abans, pero començant per l'inici i fent coses com "ChocChoChC" "PitaPitPiP"
static String repeatFront(String str, int n) {
  String cad = "";
  String front = str.substring(0,n);
  int counter = front.length();
  for (int i = 0; i < n; i++){
    cad += front.substring(0,counter);
    counter--;
  }
  return cad;
}
// Repetix les vegades que se li pasen per numero, i intercala un separador, pero elimina el final d'este separador
static String repeatSeparator(String word, String sep, int count) {
  String cad = "";
  int fw = sep.length();
  for ( int i = 0; i < count; i++){
    cad += word + sep;
  }
  return cad.substring(0,cad.length()-fw);
}
static boolean prefixAgain(String str, int n) {
  /*
  considereu el prefix format pels primers N caràcters de la cadena. 
  Aquesta cadena de prefix apareix en un altre lloc de la cadena? 
  Suposem que la cadena no està buida i que N està en l'interval 1..str.length ().
  */
   String prefix = str.substring(0, n);
    // Busquem desde n per no repetir la coincidencia. 
    for(int i = n; i <= str.length() - n; i++) {
        if(str.substring(i, i + n).equals(prefix))
            return true;
    }
    return false;
}
static String xyzMiddle(String str) {
    
  String pureMid = ""+str.charAt(str.length()/2-1) + str.charAt(str.length()/2) + str.charAt(str.length()/2+1);
  return pureMid;
}
// Torna el que estigue compres entre "bread"
static String getSandwich(String str) {
  /*
  Un entrepà és dos trossos de pa amb alguna cosa al mig. 
  Torneu la cadena que hi ha entre la primera i l'última 
  aparició de "pa" a la cadena donada, o bé torneu la cadena buida "" 
  si no hi ha dos trossos de pa.
  
  Este exercici m'ha agradat resoldrel. 

  */
  String revCad = "";
  String cad = "";
  int inici = str.indexOf("bread") + 5;
  for (int i = str.length()-1; i >= 0; i --){
    revCad += str.charAt(i);
  }
  int fin = revCad.indexOf("daerb") + 5;
  for ( int x = inici; x < str.length() - fin; x++){
    cad += str.charAt(x);
  }
  return cad;
}
// Retorna true si el asterisco te les mateixes lletres davant o detras
static boolean sameStarChar(String str) {

  for (int i = 1; i < str.length()-1; i++){
    if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1))
      return false;
  }
  return true;
}
static String oneTwo(String str) {
  /*
  Donada una cadena, calculeu una nova cadena movent 
  el primer caràcter que apareixerà després dels dos següents 
  caràcters, de manera que "abc" produeix "bca". Repetiu aquest 
  procés per a cada grup següent de 3 caràcters, de manera que "abcdef"
  produeix "bcaefd". Ignoreu qualsevol grup de menys de 3 caràcters al final.
  */

  /*
    Per resoldre este problema, tenim que tenir en conte que el bucle te que pegar 
    saltos de tres en tres. Per cada salto de tres agafarem les posicions 1 i 2 del
    fragment que ha agafat de la cadena i li concatenarem al final la posicio 0
    en un charAt. Aixo es repetira cada cicle de tres vegades. La llargaria al 
    agafar 3 caracters de la cadena, haurem de reduirla 2 punts al length().
  */
  String cad = "";
  if (str.length() < 3)
    return "";
  for (int i = 0; i < str.length()-2; i+=3){
    cad += str.substring(i+1,i+3) + str.charAt(i);
  }
  return cad;
}
/*
  Elimina tot el que estigue entre una "z" i una "p";
  Es crea un String array i una string final. 
  El primer bucle passa cada lletra al Array.
  El segon bucle substitueix tot el que estigue entre z i p 
     per un string buit.
  Es printa el nou contingut del Array a una cadena que es 
     la que es retorna. 
*/ 
public String zipZap(String str) {
  String v[] = new String [str.length()];
  String cad = "";
  if (str.length() < 3)
    return str;
  for ( int i = 0; i < v.length; i++){
    v[i] = ""+str.charAt(i);
  }
  for ( int n = 0; n < v.length; n++){
    if (v[n].equals("z") && v[n+2].equals("p"))
      v[n+1] = "";
    cad += v[n];
  }
  return cad;
}
static String starOut(String str) {
  if(str.length() < 1)
  return "";
  
if(str.length() == 1) {
  if(str.charAt(0) == '*')
      return "";
  else
      return str;
}
                              
char[] arr = new char[str.length()];
int count = 0;
                                      
                                          
if(str.charAt(0) != '*' && str.charAt(1) != '*') {
  arr[count] = str.charAt(0);
  count++;
}
                                                        
for(int i = 1; i < str.length() - 1; i++) {
  if(str.charAt(i-1)!='*' && str.charAt(i) != '*' && 
      str.charAt(i+1) != '*') {
      arr[count] = str.charAt(i);
      count++;
  }
}
                                                                                  
if(str.charAt(str.length()-1) != '*' && 
  str.charAt(str.length()-2) != '*') {
  arr[count] = str.charAt(str.length() - 1);
  count++;
}                                                                                            
return new String(arr, 0, count);
}


static String [] Sensible (String str){
  String v[] = new String[str.length() * 2];
  for ( int i = 0; i < v.length; i+=2){
    v[i] = ""+str.charAt(i);
  }
  return v;
}



// R E C U R S I O N      I
static int factorial(int n) {
  /*
  Donat n de 1 o més, torneu el factorial de n, que és n * (n-1) * (n-2) ... 1. 
  Calculeu el resultat recursivament (sense bucles).
  */
  if (n == 1)
    return 1;
  return n * factorial(n-1);
}
static int bunnyEars(int bunnies) {
  /*
  Tenim diversos conills i cada conillet té dues grans orelles. 
  Volem calcular el nombre total d’orelles de tots els conillets de manera 
  recursiva (sense bucles ni multiplicacions).
  */
  if (bunnies == 0)
    return 0;
  return 2 + bunnyEars(bunnies-1);
}
static int fibonacci(int n) {
  /*
  Els dos primers valors de la seqüència són 0 i 1 (essencialment 2 casos base). 
  Cada valor posterior és la suma dels dos valors anteriors, de manera que tota 
  la seqüència és: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Definiu un mètode recursiu 
  de fibonacci (n) que retorni l'enèsim nombre de fibonacci, amb n = 0 que representa 
  l'inici de la seqüència.
  */
  if (n == 0)
    return 0;
    else if (n == 1)
      return 1;
      
  return fibonacci(n-1) + fibonacci(n-2);
}
static int bunnyEars2(int bunnies) {
  /*
  Els conills senars  (1, 3, ..) tenen les 2 orelles normals. 
  Els conills parells (2, 4, ..) tenen 3 orelles, perquè cadascun té el peu aixecat. 
  Torneu recursivament el nombre d'orelles" a la línia 1, 2, ... n del conillet 
  */
  if ( bunnies == 0)
    return 0;
  if ( bunnies % 2 == 1)
    return 2 + bunnyEars2(bunnies -1);
  return 3+ bunnyEars2(bunnies -1);
}
static int triangle(int rows) {
  /*
  Tenim un triangle fet de blocs. La fila superior té 1 bloc, 
  la següent fila cap avall té 2 blocs, la següent fila té 3 blocs, etc. 
  Calculeu recursivament (sense bucles ni multiplicacions) 
  el nombre total de blocs en aquest triangle amb el nombre de files donat.
  */
  if (rows == 0)
    return 0;
  return rows + triangle(rows -1);
}
static int sumDigits(int n) {
  /*
  torneu la suma dels seus dígits recursivament (sense bucles). 
  Tingueu en compte que el mod (%) per 10 proporciona el dígit més a la dreta 
  (126% 10 és 6), mentre que dividir (/) per 10 elimina el dígit més a la dreta 
  (126/10 és 12).
  */
    if(n == 0)
        return 0;
    return n % 10 + sumDigits(n / 10);
}
static int count7(int n) {
  /*
  Donat un int n no negatiu, torneu el recompte de les ocurrències de 7 com a dígit, 
  de manera que, per exemple, 717 produeix 2. (sense bucles). Tingueu en compte que el 
  mod (%) per 10 proporciona el dígit més a la dreta (126% 10 és 6),
  mentre que dividir (/) per 10 elimina el dígit més a la dreta (126/10 és 12).
  */
   if(n == 0)
        return 0;
          
    if(n % 10 == 7)
        return 1 + count7(n / 10);
                    
    return count7(n / 10);
}




  // MAIN 
  public static void main(String[] args) {
    System.out.println(Arrays.toString(Sensible("Sensible")));
  }
}
