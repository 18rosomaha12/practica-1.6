public class Sadovnik {

    public Sadovnik(Plant plant) {
    }

    public void filter(Plant plant){
        String title = plant.getTitle();
        title = title.replaceAll("[eyuioaEYUIOA]","");
        title = title + " VGTBL";
        plant.setTitle(title);
    }
}