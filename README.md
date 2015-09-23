# Cassndra, using map as a Column.

    @CassandraType(type = DataType.Name.MAP, typeArguments = {DataType.Name.TEXT, DataType.Name.TEXT})  
    @Column("brand_opinions")

    private Map<String, String> brandOpinions;

### CassandraConfiguration file contains local cassandra server details.

- **keyspace**
- **contactPoint**
- **port**
   
