package de.ja.lieferfix.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Delivery.class)
public abstract class Delivery_ extends de.ja.lieferfix.entity.utils.StringIdEntity_ {

	public static volatile SingularAttribute<Delivery, State> shipmentState;
	public static volatile SingularAttribute<Delivery, Customer> recipent;
	public static volatile SingularAttribute<Delivery, Shipment> shipment;
	public static volatile SingularAttribute<Delivery, Customer> sender;
	public static volatile SingularAttribute<Delivery, Float> price;
	public static volatile SingularAttribute<Delivery, Type> type;

}

