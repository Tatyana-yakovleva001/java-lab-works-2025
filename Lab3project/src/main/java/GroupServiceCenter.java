import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class GroupServiceCenter {
    private int uniqueNumber;
    private List<ServiceCenter> centers;

    public GroupServiceCenter() {
        this.uniqueNumber = 0;
        this.centers = new ArrayList<>();
    }

    public GroupServiceCenter(int uniqueNumber, List<ServiceCenter> centers){
        this.uniqueNumber = uniqueNumber;
        this.centers = new ArrayList<>(centers);
    }

    public int getUniqueNumber(){
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber){
        this.uniqueNumber = uniqueNumber;
    }

    public ServiceCenter getCenter(int index){
        if(index >= 0 && index < centers.size()){
            return centers.get(index);
        }
        return null;
    }

    public void setCenters(int index , ServiceCenter center){
        if(index >= 0 && index < centers.size()){
            centers.set(index, center);
        }


    }

    public List<ServiceCenter>  getCenters() {
        return new ArrayList<>(centers); // возвращаем копию
    }

    public void addCenter(ServiceCenter center) {
        centers.add(center);
    }

    public boolean removeByStationName (String NameStation){
        return centers.removeIf(center -> center.getNameStation().equalsIgnoreCase(NameStation));


    }

    public void sortByRepairCost(){
        Collections.sort(centers, (c1, c2) -> Double.compare(c1.getRepairCost(), c2.getRepairCost()));

    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Группа станций техобслкживания №").append(uniqueNumber).append("\n");
        sb.append("Кол-во объектов: " ).append(centers.size()).append("\n\n");
        for(ServiceCenter center: centers){
            sb.append(center.toString()).append("\n");
        }
        return sb.toString();
    }


}
