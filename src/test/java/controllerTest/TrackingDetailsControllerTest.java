package controllerTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.app.controller.TrackingDetailsController;
import com.app.response.CommonMessage;
import com.app.response.TrackingDetailsResponse;
import com.app.service.TrackingDetailsServ;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class TrackingDetailsControllerTest
{
	  @Mock
	TrackingDetailsServ trackServiceMock ;
	@InjectMocks
     TrackingDetailsController trackcontrollerMock;
     TrackingDetailsResponse resp;
     CommonMessage message;
	   @Before
	    public void setUp() throws Exception {
	         MockitoAnnotations.initMocks(this);
	         resp = new TrackingDetailsResponse();
	         message =new CommonMessage();
	    }

	@Test
	public void testgetTrackingById_Pass() throws Exception {
		when(trackServiceMock.getTrackingDetails(anyInt())).thenReturn(resp);
		assertNotNull(trackcontrollerMock.getTrackingById(anyInt()));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testgetTrackingById_Fail() throws Exception {
		when(trackServiceMock.getTrackingDetails(anyInt())).thenThrow(Exception.class);
		assertNotNull(trackcontrollerMock.getTrackingById(anyInt()));
	}
	
	@Test
	public void testgetTrackingById_Pass2() throws Exception {
		when(trackServiceMock.getTrackingDetails(anyInt())).thenReturn(null);
		assertNotNull(trackcontrollerMock.getTrackingById(anyInt()));
	}
	
}
