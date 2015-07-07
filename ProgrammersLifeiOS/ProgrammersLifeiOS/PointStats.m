//
//  PointStats.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "PointStats.h"

@implementation PointStats

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}

// getter methods
-(int)getBrainPoints { return brainPoints; }
-(int)checkPoints { return checkPoints; }
-(int)starPoints { return starPoints; }

// setter methods
-(void)setBrainPoints:(int)value { brainPoints = value; }
-(void)setCheckPoints:(int)value { checkPoints = value; }
-(void)setStarPoints:(int)value { starPoints = value; }

@end
