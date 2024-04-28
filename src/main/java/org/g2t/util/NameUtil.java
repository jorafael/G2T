package br.ufpi.paa.util;

import java.util.Random;

public class NameUtil {
    private static Random random;

    private static Random getRandom() {
        if (random == null) {
            random = new Random();
        }
        return random;
    }
    public static String getManName() {
        int index = getRandom().nextInt(0, mensNames.length);
        return mensNames[index];
    }

    public static String getWomanName() {
        int index = getRandom().nextInt(0, womensNames.length);
        return womensNames[index];
    }

    public static String getManOrWomanName(){
        if(getRandom().nextBoolean()){
            return getManName();
        } else {
            return getWomanName();
        }
    }

    public static String getManNameAtIndex(int index) {
        if(index>=0 && index < mensNames.length){
            return mensNames[index];
        }
        return null;
    }

    public static String getWomanNameAtIndex(int index) {
        if(index>=0 && index < womensNames.length){
            return womensNames[index];
        }
        return null;
    }

    public static int getMensNamesLength() {
        return mensNames.length;
    }

    public static int getWomensNamesLength() {
        return womensNames.length;
    }

    private static String[] mensNames = {
            "Abdias", "Abel", "Abelardo", "Abílio", "Abraão", "Abrão", "Acabe", "Acácio", "Adalberto", "Adam", "Adão",
            "Ademar", "Ademir", "Adeodato", "Adérito", "Adolfo", "Adonai", "Adonias", "Adonilo", "Adoniran", "Adonis",
            "Adrian", "Adriano", "Adriel", "Adryan", "Afonso", "Agapito", "Agenor", "Aguila", "Aguinaldo", "Aílton",
            "Aimar", "Aladino", "Alan", "Alano", "Albano", "Alberto", "Albino", "Alcebíades", "Alcides", "Alcino",
            "Aldemar", "Alder", "Alderico", "Aldo", "Aleixo", "Alejandro", "Alencar", "Alessandro", "Alex", "Alexandre",
            "Alexandrino", "Alfonso", "Alfredo", "Alípio", "Almeida", "Almir", "Alois", "Aloisio", "Aloísio", "Aloysio",
            "Altamir", "Altamiro", "Aluísio", "Alvaro", "Álvaro", "Amadeu", "Amadeus", "Amador", "Amancio", "Amaral",
            "Americo", "Américo", "Amílcar", "Amós", "Anacleto", "Ananias", "Anderson", "André", "Ângelo", "Anibal",
            "Aníbal", "Anísio", "Aniz", "Annibal", "Antenor", "Anthonio", "Anthony", "Antonio", "Antônio", "Aparecido",
            "Aparício", "Apollo", "Apolo", "Aquila", "Aquilino", "Arão", "Araripe", "Araújo", "Arian", "Ariel", "Aristides",
            "Aristóteles", "Arlindo", "Arnaldo", "Arnoldo", "Aron", "Artemas", "Arthur", "Artur", "Ary", "Asafe", "Ashton",
            "Assis", "Ataíde", "Atenágoras", "Átila", "Augustinho", "Augusto", "Aurélio", "Áureo", "Avelar", "Avelino",
            "Ayres", "Baltasar", "Baltazar", "Balthazar", "Barcelos", "Barnabé", "Barsabás", "Baruc", "Beltessazar",
            "Bem-vindo", "Ben", "Benedito", "Ben-Hur", "Benício", "Benjamim", "Benjamin", "Bento", "Bernardo", "Betinho",
            "Beto", "Biagio", "Bonifácio", "Braga", "Bráulio", "Brazil", "Breno", "Brito", "Bruno", "Bryan", "Buarque",
            "Caetano", "Caifás", "Caim", "Caio", "Caíque", "Caldas", "Caleb", "Calebe", "Camargo", "Camilo", "Cândido",
            "Carlinhos", "Carlo", "Carlos", "Carneiro", "Cássio", "Castro", "Cauã", "Cauê", "Celso", "Cesar", "César",
            "Cézar", "Charles", "Chaves", "Christian", "Christiano", "Cícero", "Claudemir", "Cláudio", "Clemente",
            "Clodomiro", "Clovis", "Conrado", "Cornelio", "Costa", "Coutinho", "Crisanto", "Crispim", "Crispo", "Cristiano",
            "Dalton", "Damian", "Damião", "Daniel", "Danilo", "Danton", "Dario", "Davi", "David", "Décio", "Dedé",
            "Denis", "Dênis", "Dias", "Diego", "Diogo", "Dionísio", "Dirceu", "Djalma", "Dom", "Domingos", "Dominic",
            "Dorival", "Douglas", "Duarte", "Dutra", "Edgar", "Edmundo", "Edson", "Eduardo", "Eli", "Elias", "Eliézer",
            "Eliseu", "Eloi", "Elton", "Emanoel", "Emanuel", "Emerson", "Enrico", "Enzo", "Er", "Erasmo", "Eriberto",
            "Eric", "Erick", "Érico", "Eros", "Esdras", "Estêvão", "Euclides", "Eugênio", "Eurico", "Eusébio", "Ezequiel",
            "Ezio", "Fabiano", "Fabio", "Fábio", "Fabrício", "Fael", "Feliciano", "Felipe", "Félix", "Ferdinando",
            "Fernando", "Ferraz", "Ferreira", "Filemon", "Flavio", "Flávio", "Florentino", "França", "Francesco", "Francis",
            "Francisco", "Frederico", "Freitas", "Gabriel", "Gael", "Gaio", "Gamaliel", "Gaspar", "Gedeão", "Geraldo",
            "Gerson", "Gil", "Gilberto", "Giovani", "Giovanni", "Giuliano", "Giulio", "Gomes", "Gonçalves", "Goulart",
            "Gouveia", "Gregório", "Guilherme", "Guimarães", "Gustavo", "Guy", "Haroldo", "Heitor", "Hélio", "Henri",
            "Henrique", "Henry", "Herbert", "Hércules", "Hermano", "Hermes", "Herodes", "Hildebrando", "Horta", "Hugo",
            "Humberto", "Iago", "Ian", "Icaro", "Igor", "Ike", "Inácio", "Isaac", "Isac", "Isaque", "Israel", "Iuri",
            "Ivã", "Ivan", "Ivo", "Jacó", "Jacob", "Jaime", "Jairo", "Jamil", "Japiassu", "Jason", "Javier", "Jean",
            "Jeferson", "Jesus", "João", "Joaquim", "Joel", "Johan", "Jonas", "Jonatas", "Jorge", "José", "Josué",
            "Juan", "Judas", "Juliano", "Julio", "Júlio", "Júnior", "Juno", "Justin", "Kael", "Kaique", "Kalel", "Kalil",
            "Kauai", "Kauê", "Kayky", "Kévin", "Klaus", "Lacerda", "Laércio", "Laerte", "Lamarca", "Lauro", "Lázaro",
            "Leal", "Leandro", "Leme", "Leo", "Leon", "Leonardo", "Leoni", "Leonor", "Léonovo", "Leopoldo", "Levi",
            "Liam", "Lineu", "Lisandro", "Lisias", "Lívio", "Lopes", "Lorenzo", "Luan", "Luca", "Lucas", "Lucca", "Luciano",
            "Lúcio", "Luigi", "Luis", "Luís", "Luiz", "Luka", "Macedo", "Maia", "Manoel", "Mansur", "Marcelo", "Márcio",
            "Marco", "Marcos", "Marinho", "Mário", "Marlon", "Marques", "Martin", "Martins", "Mateo", "Mateus", "Matheus",
            "Mathias", "Matteo", "Maurício", "Mauro", "Max", "Maximilien", "Máximo", "Michel", "Miguel", "Mike", "Milton",
            "Miranda", "Moacir", "Moisés", "Monteiro", "Moraes", "Murilo", "Natan", "Nathan", "Nelson", "Nemo", "Nero",
            "Nestor", "Neymar", "Nicolas", "Nicolau", "Noah", "Noel", "Nuno", "Olavo", "Olimpo", "Oliver", "Omar",
            "Orestes", "Orfeu", "Orlando", "Oscar", "Osmar", "Osvaldo", "Otaviano", "Otávio", "Oto", "Otto", "Patrício",
            "Paulo", "Pedro", "Philip", "Pietro", "Plínio", "Rael", "Rafael", "Rai", "Raimundo", "Ramiro", "Ramon",
            "Raul", "Ravi", "Reginaldo", "Reinaldo", "Renan", "Renato", "René", "Reynaldo", "Ricardo", "Roberto", "Rocco",
            "Rodrigo", "Róger", "Rogério", "Romeo", "Romeu", "Ronaldo", "Rubem", "Rubens", "Rui", "Ryan", "Salomão",
            "Samu", "Samuel", "Santiago", "Saulo", "Sebas", "Sebastian", "Sebastião", "Sebastien", "Sergio", "Sérgio",
            "Silas", "Simão", "Tácio", "Tadeu", "Tales", "Tarcísio", "Ted", "Téo", "Teodoro", "Thales", "Theo", "Théo",
            "Theodoro", "Thiago", "Thomas", "Thomaz", "Thor", "Tiago", "Timóteo", "Tito", "Tom", "Tomás", "Túlio", "Ulisses",
            "Vágner", "Valentim", "Valentino", "Válter", "Vicente", "Victor", "Vincent", "Vinicius", "Vinícius", "Vitor",
            "Vítor", "Vitório", "Wagner", "Waldemar", "Waldir", "Waldyr", "Walter", "Washington", "Wellington", "Wesley",
            "William", "Willian", "Wilson", "Yan", "Yann", "Yuri", "Yves", "Zacarias", "Zaqueu", "Zeno", "Zion"
    };
    private static String[] womensNames = {
            "Ada", "Adriana", "Ágata", "Agatha", "Agnes", "Aisha", "Aiyra", "Alana", "Alessandra", "Alexandra",
            "Alexia", "Alícia", "Alison", "Amália", "Amanda", "Amélia", "Amy", "Ana", "Anabela", "Analu",
            "Andressa", "Angel", "Angela", "Angélica", "Anita", "Antonella", "Antônia", "Aretha", "Ária",
            "Aurea", "Aurora", "Ava", "Ayana", "Ayla", "Aysla", "Ayumi", "Beca", "Belinda", "Bella", "Berenice",
            "Bia", "Bianca", "Brisa", "Caína", "Camille", "Camily", "Carla", "Carolina", "Caroline", "Cassiana",
            "Catarina", "Cecília", "Celeste", "Celi", "Celina", "Céu", "Charlene", "Charlote", "Charlotte",
            "Cherry", "Chloe", "Clara", "Clarice", "Clarisse", "Cléo", "Cloe", "Cora", "Coraline", "Cristal",
            "Cristiane", "Cristina", "Daiana", "Daisy", "Dália", "Dandara", "Danielle", "Daphne", "Débora",
            "Delfina", "Denise", "Diana", "Dinorá", "Diva", "Domenica", "Dominique", "Dora", "Dorotéia", "Dulce",
            "Eduarda", "Elaine", "Eleonor", "Eliana", "Elis", "Elisângela", "Eliza", "Elizabeth", "Ella",
            "Ellen", "Ellie", "Eloíse", "Elsa", "Emanuelle", "Emi", "Emily", "Emma", "Érica", "Esmeralda",
            "Eugênia", "Eva", "Eve", "Fabiana", "Fabíola", "Fany", "Felícia", "Fernanda", "Filipa", "Flor",
            "Flora", "Florence", "Florisbela", "Franciela", "Francine", "Frida", "Gabriela", "Gaby", "Gertrude",
            "Gina", "Gioconda", "Giovana", "Giovanna", "Gisele", "Giulia", "Glaice", "Graça", "Greta", "Hadassa",
            "Haidê", "Hana", "Hebe", "Helena", "Heleonora", "Helga", "Heloíse", "Holly", "Iana", "Iara",
            "Ilda", "Indira", "Inês", "Ingrid", "Iolanda", "Ioná", "Isa", "Isis", "Ismalia", "Iva", "Ivana",
            "Ivy", "Izzy", "Jaciara", "Jade", "Jafe", "Jamilly", "Janaína", "Jaqueline", "Jasmin", "Jasmine",
            "Jaya", "Jill", "Joana", "Jolie", "Josafa", "Joyce", "Judith", "Júlia", "Julie", "Juliete", "Kali",
            "Kamala", "Kamille", "Karen", "Karina", "Karolin", "Katharina", "Katherine", "Kayane", "Kefera",
            "Kelia", "Kezia", "Kiara", "Kim", "Kira", "Laila", "Laís", "Lana", "Lara", "Laudiceia", "Léia",
            "Lena", "Leona", "Lia", "Lidiane", "Lila", "Linda", "Lis", "Lisa", "Lisandra", "Lívia", "Liz",
            "Lorena", "Louise", "Luana", "Luíza", "Luna", "Lupita", "Luz", "Lyra", "Maíra", "Maísa", "Maitê",
            "Malala", "Malu", "Mara", "Margaret", "Margarida", "Mari", "Maria", "Mariana", "Mariele", "Marlúcia",
            "Maya", "Mayara", "Meg", "Mel", "Melina", "Melissa", "Mia", "Micaela", "Michelle", "Mila", "Mirela",
            "Moana", "Morgana", "Naama", "Nadia", "Nadine", "Naíra", "Nala", "Naomi", "Nara", "Nayla", "Neli",
            "Nelle", "Nelma", "Nice", "Nina", "Nísia", "Nívia", "Noêmia", "Octavia", "Odete", "Ohana", "Olga",
            "Olinda", "Olivia", "Pam", "Pâmela", "Pandora", "Patrícia", "Paula", "Perla", "Pérola", "Petra",
            "Pietra", "Priscila", "Querubim", "Quirina", "Rachel", "Rafaela", "Raiany", "Raika", "Ravena",
            "Rebeca", "Regina", "Renata", "Rita", "Rosa", "Rosana", "Rosemeire", "Rosilene", "Rubi", "Rúbia",
            "Sabara", "Safira", "Samantha", "Samara", "Samira", "Sandy", "Saori", "Sara", "Sasha", "Scarlet",
            "Selena", "Semíramis", "Serena", "Serenity", "Siena", "Sienna", "Silene", "Simone", "Sinara",
            "Sol", "Sônia", "Sophia", "Sora", "Soraia", "Stela", "Stella", "Stephanie", "Susana", "Susy",
            "Suzy", "Tábata", "Taís", "Tamara", "Tânia", "Tássia", "Telma", "Tessa", "Thaís", "Thaísa",
            "Thalia", "Ully", "Uyara", "Valdirene", "Valência", "Valentina", "Valéria", "Valquíria", "Vandana",
            "Vênus", "Vera", "Verena", "Vicky", "Violet", "Violeta", "Virgínia", "Vita", "Vitória", "Vivian",
            "Viviana", "Walesca", "Wanda", "Wilma", "Winnie", "Xerazade", "Ximena", "Xuxa", "Yalena", "Yana",
            "Yandra", "Yara", "Yarin", "Yarmina", "Ynes", "Yohana", "Yumi", "Yuna", "Zahra", "Zaida", "Zara",
            "Zenaide", "Zila", "Zoe"
    };


}
