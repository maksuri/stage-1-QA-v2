import models.MilitaryType;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.ExperimentalPlane;
import planes.Plane;

import java.util.*;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<? extends Plane> l = this.planes;
        List<PassengerPlane> x = new ArrayList<PassengerPlane>();
        for (Plane p : l) {if (p instanceof PassengerPlane) {x.add((PassengerPlane) p);}}
        return x;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<MilitaryPlane>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
            else {
            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }






        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
         List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<MilitaryPlane>();
         List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
         for (int i = 0; i < militaryPlanes.size(); i++) {
                 MilitaryPlane plane = militaryPlanes.get(i);
                 if (plane.getType() == MilitaryType.TRANSPORT) {
                          transportMilitaryPlanes.add(plane);
                  }
         }
         return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<MilitaryPlane>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<planes.ExperimentalPlane> getExperimentalPlanes() {
        List<planes.ExperimentalPlane> experimentalPlanes = new ArrayList<planes.ExperimentalPlane>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane plane1, Plane plane2) {
                return plane1.getMaxFlightDistance() - plane2.getMaxFlightDistance();
            }
        });
        return this;
    }



    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane plane1, Plane plane2) {
                return plane1.getMaxSpeed() - plane2.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane plane1, Plane plane2) {
                return plane1.getMinLoadCapacity() - plane2.getMinLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> planes) {
        for (Plane plane : planes){
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }


}
