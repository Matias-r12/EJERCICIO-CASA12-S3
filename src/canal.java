public class canal {
    private double frecuenciaMHz;
    private double anchoBandaMHz;
    private double potencia;
    private boolean activo;

    public void setFrecuenciaMHz(double frecuenciaMHz) {
        if (frecuenciaMHz > 0) {
            this.frecuenciaMHz = frecuenciaMHz;
        }
    }

    public double getFrecuenciaMHz() {
        return this.frecuenciaMHz;
    }

    public void setAnchoBandaMHz(double anchoBandaMHz) {
        if (anchoBandaMHz > 0) {
            this.anchoBandaMHz = anchoBandaMHz;
        }
    }

    public double getAnchoBandaMHz() {
        return this.anchoBandaMHz;
    }

    public void setPotencia(double potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        }
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

    public boolean isActivo() {
        return this.activo;
    }
}
