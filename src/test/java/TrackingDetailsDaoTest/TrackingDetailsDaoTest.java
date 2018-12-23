package TrackingDetailsDaoTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.orm.hibernate5.HibernateTemplate;

import static org.mockito.Mockito.*;

import com.app.component.TrackingDetailsEntity;
import com.app.repository.TrackingDetailsDaoImpl;


@RunWith(MockitoJUnitRunner.class)
public class TrackingDetailsDaoTest
{
	@Mock
	HibernateTemplate template;
	
	@Before
	public void setUp() throws Exception {
		template = mock(HibernateTemplate.class);

	}

	@Test
	public void testgetTrackingById_Pass() throws Exception {
		TrackingDetailsEntity detailsEntity = new TrackingDetailsEntity();
		detailsEntity.setTid(1);
		detailsEntity.setTname("Bala");
		detailsEntity.setTnumber(1233456L);
		TrackingDetailsDaoImpl trackingDaoMock  = new TrackingDetailsDaoImpl();
		trackingDaoMock.setTemplate(template);
		when(template.get(TrackingDetailsEntity.class, 1)).thenReturn(detailsEntity);
	      trackingDaoMock.getTrackingDetails(1);
	
	}
	
	
}
