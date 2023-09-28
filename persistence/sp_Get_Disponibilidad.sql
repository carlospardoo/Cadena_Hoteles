
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Carlos Pardo
-- Create date: 15/09/2023
-- Description:	sp para definir consultas de disponibilidad
-- =============================================
-- sp_Get_Disponibilidad '2023/12/01 19:00:00', 4
CREATE OR ALTER PROCEDURE sp_Get_Disponibilidad 
	
	@Fecha_Viaje datetime,
	@Id_Sede int = null,
	@Id_Temporada int = null,
	@Id_Tipo_Habitacion int = null,
	@Numero_Personas int = null

AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- PENDIENTE CALCULO DE LA TEMPORADA
	SELECT 
		a.Id_Habitacion,
		a.Piso,
		a.Numero_Habitacion,
		a.Capacidad
	FROM Fact_Habitacion a 
	LEFT JOIN Fact_Ocupacion_Habitacion d on a.Id_Habitacion = d.Id_Habitacion
	INNER JOIN Dim_Tipo_Habitacion b on a.Id_Tipo_Habitacion = b.Id_Tipo_Habitacion
	INNER JOIN Dim_Sede c on a.Id_Sede = c.Id_Sede
	WHERE @Fecha_Viaje not between d.Fecha_Entrada and d.Fecha_Salida or d.Fecha_Entrada is null
		and (@Id_Sede = c.Id_Sede or @Id_Sede is null)
		and (@Id_Tipo_Habitacion = a.Id_Tipo_Habitacion or @Id_Tipo_Habitacion is null)
		and (@Numero_Personas <= a.Capacidad or @Numero_Personas is null)


END
GO
