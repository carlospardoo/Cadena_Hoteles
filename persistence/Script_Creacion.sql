
--create database Cadena_Hoteles
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
('ALTA', 15000, '12/01/2023', '01/02/2024'),
('BAJA', 15000, '02/01/2023', '02/28/2023')
