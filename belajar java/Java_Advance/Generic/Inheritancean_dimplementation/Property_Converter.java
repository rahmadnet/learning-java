package Inheritancean_dimplementation;

public interface Property_Converter<P, D>
{
	P convertToEntityProperty(D databaseValue);
	
	D convertToDatabaseValue(P entityProperty);
}
