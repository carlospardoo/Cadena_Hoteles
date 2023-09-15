
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Carlos Pardo
-- Create date: 15/09/2023
-- Description:	sp para definir consultas de disponibilidad
-- =============================================
CREATE PROCEDURE sp_Get_Disponibilidad 
	
	@Fecha_Viaje datetime not null,
	@Id_Sede int,
	@Id_Temporada int,
	@Id_Tipo_Habitacion int,
	@Numero_Personas int

AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT 
		a.Id_Habitacion,
		a.Piso,
		a.Numero_Habitacion,
		a.Capacidad
	FROM Fact_Habitacion a 
	INNER JOIN Dim_Tipo_Habitacion b on a.Id_Tipo_Habitacion = b.Id_Tipo_Habitacion
	INNER JOIN Dim_Sede c on a.Id_Sede = c.Id_Sede
	


END
GO
