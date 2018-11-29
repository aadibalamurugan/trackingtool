package serviceTest;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.app.component.TrackingDetailsEntity;
import com.app.repository.TrackingDetailsDao;
import com.app.response.TrackingDetailsResponse;
import com.app.service.TrackingDetailsServImpl;
@RunWith(MockitoJUnitRunner.class)
public class TrackingDetailsServiceTest {

	@Mock
	TrackingDetailsDao trackingDaoMock ;
	@InjectMocks
	TrackingDetailsServImpl trackServiceMock;
	 TrackingDetailsResponse resp;
	 TrackingDetailsEntity entity;
	   @Before
	    public void setUp() throws Exception {
	         MockitoAnnotations.initMocks(this);
	         resp = new TrackingDetailsResponse();
	          entity = new TrackingDetailsEntity();
	    }

	   
	   @Test
		public void testgetTrackingDetails_Pass() throws Exception {
			when(trackingDaoMock.getTrackingDetails(anyInt())).thenReturn(entity);
			assertNotNull(trackServiceMock.getTrackingDetails(anyInt()));
		}
	
	   @SuppressWarnings("unchecked")
	@Test
		public void testgetTrackingDetails_Fail() throws Exception {
			when(trackingDaoMock.getTrackingDetails(anyInt())).thenThrow(Exception.class);
			//System.out.println(trackServiceMock.getTrackingDetails(anyInt()));
		}
	   
	   @Test
		public void testgetTrackingDetails_Pass_2() throws Exception {
			when(trackingDaoMock.getTrackingDetails(anyInt())).thenReturn(null);
			assertNotNull(trackServiceMock.getTrackingDetails(anyInt()));
		}
	
	
	
}
