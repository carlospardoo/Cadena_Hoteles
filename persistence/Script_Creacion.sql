
--create database Cadena_Hoteles 
--CONTAINMENT = partial 
--collate SQL_Latin1_General_CP1_CI_AS 
--with 
--	default_language = 3082,
--	DEFAULT_FULLTEXT_LANGUAGE = 3082
--go

use Cadena_Hoteles
go

create table Dim_Sede(
	Id_Sede int not null primary key identity(1, 1),
	Nombre_Sede varchar(50) not null,
	Cupo int not null
)

create table Dim_Tipo_Habitacion(
	Id_Tipo_Habitacion int not null primary key identity(1, 1),
	Nombre_Tipo_Habitacion varchar(50) not null,
	Costo money not null
)

create table Dim_Temporada(
	Id_Temporada int not null primary key identity(1, 1),
	Nombre_Temporada varchar(50) not null,
	Costo_Hora money not null,
	Fecha_inicio date not null,
	Fecha_Fin date not null
)

create table Dim_Persona(
	Id_Persona int not null primary key identity(1, 1),
	Nombre varchar(50) not null,
	Apellido varchar(50) not null,
	Telefono varchar(20) not null,
	Email varchar(50)
)

create table Fact_Habitacion(
	Id_Habitacion int not null primary key identity(1, 1),
	Piso varchar(10) not null,
	Numero_Habitacion int not null,
	Capacidad int not null,
	Id_Tipo_Habitacion int not null,
	Id_Sede int not null
)

create table Fact_Ocupacion_Habitacion(
	Id_Ocupacion int not null primary key identity(1, 1),
	Fecha_Entrada datetime not null,
	Fecha_Salida datetime not null,
	Costo_Total money not null,
	Id_Temporada int not null,
	Id_Habitacion int not null,
	Id_Persona int
)
go

alter table Fact_Habitacion add constraint FK_Tipo_Habitacion foreign key (Id_Tipo_Habitacion) references Dim_Tipo_Habitacion(Id_Tipo_Habitacion)
alter table Fact_Habitacion add constraint FK_Sede foreign key (Id_Sede) references Dim_Sede(Id_Sede)

alter table Fact_Ocupacion_Habitacion add constraint FK_Temporada foreign key (Id_Temporada) references Dim_Temporada(Id_Temporada)
alter table Fact_Ocupacion_Habitacion add constraint FK_Habitacion foreign key (Id_Habitacion) references Fact_Habitacion(Id_Habitacion)
alter table Fact_Ocupacion_Habitacion add constraint FK_Persona foreign key (Id_Persona) references Dim_Persona(Id_Persona)

go

-- INSERCION DE DATOS 
insert into Dim_Sede(Nombre_Sede, Cupo)
values
('Barranquilla', 132),
('Cali', 132),
('Cartagena', 88),
('Bogotá', 252)


insert into Dim_Tipo_Habitacion(Nombre_Tipo_Habitacion, Costo)
values
('Estandar', 40000),
('Premium', 100000),
('VIP', 300000)

insert into Dim_Temporada(Nombre_Temporada, Costo_Hora, Fecha_inicio, Fecha_Fin)
values
('ALTA', 15000, '01/12/2023', '08/01/2024'),
('BAJA', 50, '01/02/2023', '28/02/2023')

insert into Dim_Persona(Nombre, Apellido, Telefono, Email)
values
('Carlos', 'Pardo', '+57 3213933592', 'carlos.pardo@mail.com'),
('Juana', 'Tello', '+52 4567891230', 'juana.tello@mail.com')

insert into Fact_Habitacion(Piso, Numero_Habitacion, Capacidad, Id_Sede, Id_Tipo_Habitacion)
values
('7', 701, 4, 4, 1),
('1', 101, 3, 4, 3),
('2', 201, 1, 4, 2),
('1', 1, 4, 1, 1)

insert into Fact_Ocupacion_Habitacion( Fecha_Entrada, Fecha_Salida, Costo_Total, Id_Temporada, Id_Habitacion, Id_Persona )
values
('01/12/2023 18:00:00', '08/01/2024 8:00:00', (DATEDIFF(hour, '01/12/2023 18:00:00', '01/08/2024 8:00:00') * 50) + (DATEDIFF(day, '01/12/2023 18:00:00', '08/01/2024 8:00:00') * 40000) , 1, 1, 1 ),
('01/10/2023 12:00:00', '15/10/2023 12:00:00', (DATEDIFF(hour, '01/10/2023 12:00:00', '15/10/2023 12:00:00') * 50) + (DATEDIFF(day, '01/10/2023 12:00:00', '15/10/2023 12:00:00') * 40000) , 1, 2, 2 )
