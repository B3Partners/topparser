create schema top250nl;

create table top250nl.hoogte(
  id bigint generated by default as identity (start with 1),
  primary key (id),
  identificatie varchar(255),
  topnltype varchar(255),
  brontype varchar(255),
  bronactualiteit timestamp,
  bronbeschrijving varchar(255),
  bronnauwkeurigheid double precision,
  objectBeginTijd timestamp,
  objectEindTijd timestamp,
  visualisatieCode integer,

   typeHoogte varchar(255),
   geometrie clob,
   referentieVlak varchar(255),
   hoogte double precision
    
);
create table top250nl.FunctioneelGebied(
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,

    
  typeFunctioneelGebied varchar(255),
  soortnaam varchar(255),
  naamNL varchar(255),
  naamFries varchar(255),
    
  geometrie clob,
  primary key (id)
  );


create table top250nl.Gebouw(
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,

  typeGebouw varchar(255),
  status varchar(255),
  fysiekVoorkomen varchar(255),
  hoogteklasse varchar(255),
  hoogte double precision,
  soortnaam varchar(255),
  naam varchar(255),
  naamFries varchar(255),
    
    
  geometrie clob,
  primary key (id)
  );



create table top250nl.GeografischGebied(
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,

    
  typeGeografischGebied varchar(255),
  naamNL varchar(255),
  naamFries varchar(255),
    
  geometrie clob,
  primary key (id)
  );


create table top250nl.Inrichtingselement(
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,

    
  typeInrichtingselement varchar(255),
  soortnaam varchar(255),
  status varchar(255),
  hoogteniveau bigint,
    
  geometrie clob,
  primary key (id)
  );



create table top250nl.Plaats(
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,

    
  typeGebied varchar(255),
  aantalInwoners bigint,
  naamOfficieel varchar(255),
  naamNL varchar(255),
  naamFries varchar(255),
    
  geometrie clob,
  primary key (id)
  );


create table top250nl.RegistratiefGebied(
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,

    
  typeRegistratiefGebied varchar(255),
  naamOfficieel varchar(255),
  naamNL varchar(255),
  naamFries varchar(255),
  nummer varchar(255),
  geometrie clob,
  primary key (id)
  );


create table top250nl.Relief(
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,

  typeRelief varchar(255),
  hoogteklasse varchar(255),
  geometrie clob,
  hoogteniveau bigint,
  primary key (id)
  );

create table top250nl.Spoorbaandeel (
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,


  typeInfrastructuur varchar(255),
  typeSpoorbaan varchar(255),
  fysiekVoorkomen varchar(255),
  spoorbreedte varchar(255),
  aantalSporen varchar(255),
  vervoerfunctie varchar(255),
  elektrificatie Boolean,
  status varchar(255),
  brugnaam varchar(255),
  tunnelnaam varchar(255),
  baanvaknaam varchar(255),
  hoogteniveau bigint,
    
  geometrie clob,
  primary key (id)
  );

create table top250nl.Terrein(
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,

    
  typeLandgebruik varchar(255),
  naam varchar(255),
    
  geometrie clob,
  primary key (id)
  );


create table top250nl.Waterdeel (
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,


  typeWater varchar(255),
  breedteklasse varchar(255),
  fysiekVoorkomen varchar(255),
  voorkomen varchar(255),
  getijdeinvloed Boolean,
  vaarwegklasse varchar(255),
  naamOfficieel varchar(255),
  naamNL varchar(255),
  naamFries varchar(255),
  isBAGnaam Boolean,
  sluisnaam varchar(255),
  brugnaam varchar(255),
  hoogteniveau bigint,
    
  geometrie clob,
  primary key (id)
  );


create table top250nl.Wegdeel (
	 id bigint generated by default as identity (start with 1),
      identificatie varchar(255),
      topnltype varchar(255),
      brontype varchar(255),
      bronactualiteit timestamp,
      bronbeschrijving varchar(255),
      bronnauwkeurigheid double precision,
      objectBeginTijd timestamp,
      objectEindTijd timestamp,
      visualisatieCode integer,


  typeInfrastructuur varchar(255),
  typeWeg varchar(255),
  hoofdverkeersgebruik varchar(255),
  fysiekVoorkomen varchar(255),
  verhardingsbreedteklasse varchar(255),
  gescheidenRijbaan Boolean,
  verhardingstype varchar(255),
  aantalRijstroken bigint,
  hoogteniveau bigint,
  status varchar(255),
  naam varchar(255),
  isBAGnaam Boolean,
  aWegnummer varchar(255),
  nWegnummer varchar(255),
  eWegnummer varchar(255),
  sWegnummer varchar(255),
  afritnummer varchar(255),
  afritnaam varchar(255),
  knooppuntnaam varchar(255),
  brugnaam varchar(255),
  tunnelnaam varchar(255),

  geometrie clob,
  primary key (id)
  );