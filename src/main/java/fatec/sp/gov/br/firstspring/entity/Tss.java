package fatec.sp.gov.br.firstspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tss")
public class Tss {

    @Id
	@Column(name = "tss_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "tss_avg_min")
	private Integer tssAvgMin;

	@Column(name = "tss_exp_plat")
	private Double tssExpPlat;

	@Column(name = "tss_avg_hr")
	private Integer tssAvgPlat;

    @Column(name = "tss_exp_content")
	private Double tssExpContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTssAvgMin() {
        return tssAvgMin;
    }

    public void setTssAvgMin(Integer tssAvgMin) {
        this.tssAvgMin = tssAvgMin;
    }

    public Double getTssExpPlat() {
        return tssExpPlat;
    }

    public void setTssExpPlat(Double tssExpPlat) {
        this.tssExpPlat = tssExpPlat;
    }

    public Integer getTssAvgPlat() {
        return tssAvgPlat;
    }

    public void setTssAvgPlat(Integer tssAvgPlat) {
        this.tssAvgPlat = tssAvgPlat;
    }

    public Double getTssExpContent() {
        return tssExpContent;
    }

    public void setTssExpContent(Double tssExpContent) {
        this.tssExpContent = tssExpContent;
    }

}
