package builder;

public class Car {

		private String engine;//엔진
		private boolean airbag;//에어백 여부
		private String color;//차량 색상
		private boolean cameraSencor;//카메라센서 유무
		private boolean AEB;//자동급제동장치 유무
		
		public Car(String engine, boolean airbag, String color, boolean cameraSencor, boolean aEB) {
			this.engine = engine;
			this.airbag = airbag;
			this.color = color;
			this.cameraSencor = cameraSencor;
			this.AEB = AEB;
		}

		@Override
		//객체들 간단히 출력해주는 함수
		public String toString() {
			StringBuilder sb=new StringBuilder();
			
			sb.append("car spec: ");
			sb.append("camerSensor "+(cameraSencor?"Y":"N")+"\n");
			sb.append("Engine "+engine+"\n");
			sb.append("airbag "+(airbag?"Y":"N")+"\n");
			sb.append("color "+color+"\n");
			sb.append("AEB "+(AEB?"Y":"N")+"\n");
			
			
			return  sb.toString();
		}
		
	
		
		
	
}
