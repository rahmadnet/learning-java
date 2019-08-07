package Inheritancean_dimplementation;

public class GeneralConverterTest<EntityType, DatabaseType, Converter extends Property_Converter<EntityType, DatabaseType>>
{
	protected void testEntityConversion(EntityType entityValue, Converter converter)
	{
		DatabaseType databaseValue = converter.convertToDatabaseValue(entityValue);
		
		EntityType databaseValueCopnvertedToEntityValue = converter.convertToEntityProperty(databaseValue);
				
	}
	
	protected void testDatabaseConversion(DatabaseType databaseValue, Converter converter)
	{
		EntityType entityValue = converter.convertToEntityProperty(databaseValue);
		
		DatabaseType entityValueConvertedToDatabaseValue = converter.convertToDatabaseValue(entityValue);
	}
}
