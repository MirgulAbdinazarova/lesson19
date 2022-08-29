package homework19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Kyn kyn = Kyn.Ишшемби;

        switch (kyn){
            case Дуйшомбу -> System.out.println("Дуйшомбу куну жава окуймун");
            case Шейшемби -> System.out.println("Шейшемби куну практика болот" );
            case Шаршемби -> System.out.println("Шаршемби англис тили болот");
            case Бейшемби -> System.out.println("Бейшемби куну англис тилинен " +
                    "практика болот");
            case Жума -> System.out.println("Жума куну да жава окуймун");
            case Ишшемби -> System.out.println("Ишшемби куну оз алдынча даярданамын");
            case Жекшемби -> System.out.println("Выходной");
            default -> System.out.println("Мындай кун жок");
        }
    }
}