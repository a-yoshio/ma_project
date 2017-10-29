$(function(){
	$(window).ready(function(){
		initMap();
	});
	
	//GoogleMap
	function initMap() {
        var matsugaoka = {lat: 35.640061, lng: 139.639931};
        var map = new google.maps.Map(document.getElementById('map'), {
        	center: {lat: 35.640061, lng: 139.639931},
        	zoom: 18
        });
        var marker = new google.maps.Marker({
          position: matsugaoka,
          map: map
        });
      };
});