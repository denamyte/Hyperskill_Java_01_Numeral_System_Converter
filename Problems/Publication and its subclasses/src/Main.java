class Publication {

    private final String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        StringBuilder sb = new StringBuilder(getType());
        if (!getDetails().isEmpty()) {
            sb.append(String.format(" (%s)", getDetails()));
        }
        return sb.append(": ").append(title).toString();
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
    }

}

class Newspaper extends Publication {

    private final String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public String getDetails() {
        return "source - " + source;
    }

}

class Article extends Publication {

    private final String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public String getDetails() {
        return "author - " + author;
    }

}

class Announcement extends Publication {

    private final int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getType() {
        return "Announcement";
    }

    @Override
    public String getDetails() {
        return "days to expire - " + daysToExpire;
    }

}

//class Main {
//    public static void main(String[] args) {
//        System.out.println(new Publication("The new era").getInfo());
//        System.out.println(new Newspaper("Football results", "Sport news").getInfo());
//        System.out.println(new Article("Why the Sun is hot", "Dr James Smith").getInfo());
//        System.out.println(new Announcement("Will sell a house", 30).getInfo());
//    }
//}