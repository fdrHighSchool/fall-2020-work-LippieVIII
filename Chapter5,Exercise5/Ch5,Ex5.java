class Ch5,Ex5 {
  public static void main(String[] args) {
    System.out.println("Hello, kids! I'm about to sing the most boring song you'll ever hear!");
    lyricsFor(99);///We're using the void method for this one. Hehehe, nothing to return, oh silly me!
  }

  public static void lyricsFor(int bearNumber){///the integer 99 in lyrics for was passed onto bearNumber. (Basicall 99 but masqueraded as "bearNumber.")
    if (bearNumber > 0) {///That means it's not going to stop repeating for 99 times
      System.out.println(bearNumber + " bottles of beer on the wall,");
      System.out.println(bearNumber + " bottles of beer,");
      System.out.println("ya' take one down, ya' pass it around,");
      System.out.println(bearNumber-- + "bottles of beer on the wall.");
      lyricsFor(bearNumber);
    }
    else {///HOWEVER, when it reaches 0!
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya' can't take one down, ya' can't pass it around,");
      System.out.println("'cause there are no more bottles of beer on the wall!");
    }
  }
}
/*
99 bottles of beer on the wall,
99 bottles of beer,
ya’ take one down, ya’ pass it around,
98 bottles of beer on the wall.
No bottles of beer on the wall,
no bottles of beer,
ya’ can’t take one down, ya’ can’t pass it around,
’cause there are no more bottles of beer on the wall!

ALSO THE SONG LYRICS GOES DOWN BOTTLE-BY-BOTTLE UNTIL THERE ARE NO MORE BOTTLES OF BEER ON THE WALL! I FINALLY REALIZED THIS ON 11/27/2020 at 12:16 am EST.
*/
