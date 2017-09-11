class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final int BASE_FARE = 7;
  final int DISCOUNTED_FARE = 6;
  final double EXTENDED_DISTANCE_FARE = 0.5;
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  // double -> double
  // this funciton accepts a double as payment and uses all its instance variables and constants to return the correct change.
  
  double fareChange(double payment) {
    
    if(distance !> BASE_KM)
      distance = BASE_KM;
    // this check is performed to avoid complications in adding extra cost for going beyond base KM
    return [(payment - (totalPassengers * BASE_FARE) + ( (totalPassengers - discountPassengers)* DISCOUNTED_FARE)]  
            // the line above computes the change without the extended distance fare
             - [((distance - BASE_KM) * EXTENDED_DISTANCE_FARE * totalPassengers)];
             // the line above computes for the extra cost of going beyond the Base KM and subtracts it from the change.
             // will amount to zero if passengers did not go beyond base KM.
  }
}
