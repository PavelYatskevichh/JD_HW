package com.academy.yatskevich.lesson6;

public class Task4 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("МИ-26", 3000, 60000, 100);
        Airplane airplane2 = new Airplane("ТУ-70", 2000, 90000, 20);
        MannedAircraft airplane3 = new Airplane("Boeing 737", 1500, 15000, 30);
        Helicopter helicopter1 = new Helicopter("Apache", 2000, 15000, 15);
        Helicopter helicopter2 = new Helicopter("КА-52", 1500, 18000, 18);
        Drone drone1 = new Drone("MQ-1 Predator", 300, 8000);
        Quadcopter quadcopter1 = new Quadcopter("DJI Phanton", 20, 10);

        Airline airline = new Airline();
        System.out.println("Общая вместимость (кол-во человека наботру): " + airline.countTotalCapacity(airplane1,
                airplane2, airplane3, helicopter1, helicopter2, drone1, quadcopter1));
        System.out.println("Общая грузоподъемность (кг): " + airline.countTotalLoadCapacity(airplane1, airplane2,
                airplane3, helicopter1, helicopter2, drone1, quadcopter1));
        System.out.println("Средняя дальность полета (км): " + airline.countAverageFlightRange(airplane1, airplane2,
                airplane3, helicopter1, helicopter2, drone1, quadcopter1));


        Aircraft[] aircrafts = airline.aircraftsToArray(airplane1, airplane2, airplane3, helicopter1, helicopter2,
                drone1, quadcopter1);
        airline.sortAccordingFlightRange(aircrafts);
        System.out.println("Перечень воздушных судов по дальности полета (от меньшего к большему в км):");
        for (Aircraft n : aircrafts) {
            System.out.println(n.getName() + "   " + n.getFlightRange());
        }

        airline.findAccordingCapacity(aircrafts, 0);
        airline.findAccordingLoadCapacity(aircrafts, 2000);
        airline.findAccordingFlightRange(aircrafts, 22000);
        airline.findAccordingParameters(aircrafts, 1500, 15000, 30);
    }
}
