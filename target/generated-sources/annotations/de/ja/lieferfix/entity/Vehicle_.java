package de.ja.lieferfix.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Vehicle.class)
public abstract class Vehicle_ extends de.ja.lieferfix.entity.utils.StringIdEntity_ {

	public static volatile SingularAttribute<Vehicle, String> Brand;
	public static volatile SingularAttribute<Vehicle, String> Model;
	public static volatile SingularAttribute<Vehicle, String> registrationDate;
	public static volatile SingularAttribute<Vehicle, Shipment> actualShipment;
	public static volatile SingularAttribute<Vehicle, Long> insuranceId;

}

